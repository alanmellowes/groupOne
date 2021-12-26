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
    private Date date_payment;

    public Payment() {
    }

    public Payment(double amount, int fromAccountID, int toAccountID, Date timeOfPayment, int id) {
        this.amount = amount;
        this.fromAccountID = fromAccountID;
        this.toAccountID = toAccountID;
        this.date_payment = date_payment;
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
