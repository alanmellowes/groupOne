
package com.nciwebapi.groupone;
import java.util.Date;

/**
 *
 * @author nikita
 */
 
 
 
public class transactions {
    private int id;
    private int customer_id;
	private double amount;
	private int fromAccountID;
	private int toAccountID;
	private Date timeOfPayment;
	private int pay_id;

    public transactions(int id, int fromAccountID, int customer_id, double amount, int toAccountID, Date timeOfPayment, int pay_id) {
        this.id = id;
        this.customer_id = customer_id;
        this.amount = amount;
        this.fromAccountID = fromAccountID;
        this.toAccountID = toAccountID;
        this.timeOfPayment = timeOfPayment;
        this.pay_id = pay_id;
        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getFromAccountID() {
        return fromAccountID;
    }

    public void setFromAccountID(int fromAccountID) {
        this.fromAccountID = fromAccountID;
    }

    public int getToAccountID() {
        return toAccountID;
    }

    public void setToAccountID(int toAccountID) {
        this.toAccountID = toAccountID;
    }

    public Date getTimeOfPayment() {
        return timeOfPayment;
    }

    public void setTimeOfPayment(Date timeOfPayment) {
        this.timeOfPayment = timeOfPayment;
    }

    public int getPay_id() {
        return pay_id;
    }

    public void setPay_id(int pay_id) {
        this.pay_id = pay_id;
    }
        
        
}
