package com.nciwebapi.groupone.resources;

import com.nciwebapi.groupone.Account;
import com.nciwebapi.groupone.Payment;
import errorHandling.InputException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import storage.AccountStorage;
import storage.PaymentStorage;

/**
 *
 * @author Alan.Mellowes
 */
@Path("/payments")
public class PaymentResource {

    private final String msg = new String("Payment creation failed");
    private double amount;
    private int senderAccountID;
    private int receiverAccountID;

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Path("/new")
    public Response create(
            @FormParam("amount") String str_amount,
            @FormParam("receiver") String str_receiverAccountID,
            @FormParam("sender") String str_senderAccountID)
            throws InputException, NumberFormatException, WebApplicationException {
        validateRawInput(str_amount, str_senderAccountID, str_receiverAccountID);
        Account receiverAccount = AccountStorage.getStore().get(receiverAccountID);
        Account senderAccount = AccountStorage.getStore().get(senderAccountID);

        validatePaymentInput(senderAccount, receiverAccount, senderAccountID, receiverAccountID, amount);

        Payment pt = new Payment();

        pt.setSenderAccountID(senderAccountID);
        pt.setAmount(amount);
        pt.setReceiverAccountID(receiverAccountID);
        Integer id = PaymentStorage.getStorage().size() + 1;
        pt.setId(id);
        pt.setTimeOfPayment(new Date(System.currentTimeMillis()));

        PaymentStorage.getStorage().put(id, pt);

        receiverAccount.setBalance(receiverAccount.getBalance() - amount);
        senderAccount.setBalance(senderAccount.getBalance() + amount);

        AccountStorage.getStore().put(senderAccountID, senderAccount);
        AccountStorage.getStore().put(receiverAccountID, senderAccount);
        return Response
                .status(Response.Status.CREATED)
                .entity("Account " + senderAccountID + " has successfully sent a payment of " + amount + " to " + receiverAccountID + " confirmation payment number:" + id)
                .header("Follow to view payment details",
                        "http://localhost:8080/bank/payments"
                        + String.valueOf(pt.getId())).build();
    }

    private void validateRawInput(String str_amount, String str_senderAccountID, String str_receiverAccountID) throws InputException, NumberFormatException, WebApplicationException {
        try {
            if (str_receiverAccountID.isEmpty()) {
                throw new InputException("Receiver invalid");
            }
            if (str_amount.isEmpty()) {
                throw new InputException(msg + "Amount invalid");
            }
            if (str_senderAccountID.isEmpty()) {
                throw new InputException("Sender invalid");
            }

            this.senderAccountID = new Integer(str_senderAccountID);
            this.receiverAccountID = new Integer(str_receiverAccountID);
            this.amount = new Double(str_amount);

            if (amount <= 0) {
                throw new InputException(msg + "Payment cannot be 0");
            }
            String[] splitter = str_amount.toString().split("\\.");
            if (splitter.length > 1 && splitter[1].length() >= 3) {
                throw new InputException(msg + " Correct format is two decimal places");
            }
        } catch (NumberFormatException e) {
            throw new InputException(e.getMessage());
        }
    }

    private void validatePaymentInput(Account receiverAccount, Account senderAccount, int receiverAccountID, int senderAccountID, double amount)
            throws InputException, NumberFormatException, WebApplicationException {
        if (receiverAccount == null) {
            throw new NotFoundException(msg.concat("Receiver account: " + receiverAccount + " does not exist"));
        }
        if (senderAccount == null) {
            throw new NotFoundException(msg.concat("Sender account: " + senderAccount + " does not exist"));
        }
        if (receiverAccountID == senderAccountID) {
            throw new NotFoundException(msg.concat("Sender and Receiver cannot be the same"));
        }

        if (senderAccount.getBalance() <= 0 || senderAccount.getBalance() - amount < 0) {
            throw new WebApplicationException(msg.concat("Insufficient funds"));
        }
        return;
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Payment findById(@PathParam("id") String str_id)
            throws InputException, NotFoundException {
        Integer id;
        try {
            id = new Integer(str_id);
        } catch (NumberFormatException e) {
            throw new InputException("Enter a number to receive a payment");
        }
        Payment pt = PaymentStorage.getStorage().get(new Integer(id));
        if (pt == null) {
            throw new NotFoundException("Payment with ID: " + id + " does not exist");
        }
        return pt;
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Payment> getPayments() {
        List<Payment> payments = new ArrayList<Payment>();
        payments.addAll(PaymentStorage.getStorage().values());
        return payments;
    }
}
