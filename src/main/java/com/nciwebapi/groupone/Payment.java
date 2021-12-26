package com.nciwebapi.groupone;

import java.util.Date;

/**
 *
 * @author florm
 */
public class Payment {

    private int id;
    private double amount;
    private int fromAccountID;
    private int toAccountID;
    private Date timeOfPayment;

    public Payment() {
    }

    public Payment(double amount, int fromAccountID, int toAccountID, Date timeOfPayment, int id) {
        this.amount = amount;
        this.fromAccountID = fromAccountID;
        this.toAccountID = toAccountID;
        this.timeOfPayment = timeOfPayment;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
