package com.nciwebapi.groupone;

import java.util.Date;

/**
 *
 * @author florm
 */
public class Payment {

    private int id;
    private double amount;
    private int senderAccountID;
    private int receiverAccountID;
    private Date date_payment;

    public Payment() {
    }

    public Payment(double amount, int senderAccountID, int receiverAccountID, Date timeOfPayment, int id) {
        this.amount = amount;
        this.senderAccountID = senderAccountID;
        this.receiverAccountID = receiverAccountID;
        this.date_payment = date_payment;
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getSenderAccountID() {
        return senderAccountID;
    }

    public void setSenderAccountID(int senderAccountID) {
        this.senderAccountID = senderAccountID;
    }

    public int getReceiverAccountID() {
        return receiverAccountID;
    }

    public void setReceiverAccountID(int receiverAccountID) {
        this.receiverAccountID = receiverAccountID;
    }

    public Date getTimeOfPayment() {
        return date_payment;
    }

    public void setTimeOfPayment(Date date_payment) {
        this.date_payment = date_payment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
