package com.nciwebapi.groupone;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;

public class Account {

    private int id, customer_id, sort_code, number_Account;
    private double balance;
    private String type_Account;
    private List<Customer> customers;

    public Account() {
    }

    public Account(int id, int customer_id, double balance, String acc_type, int sort_code, int acc_num) {
        this.id = id;
        this.customer_id = customer_id;
        this.balance = balance;
        this.type_Account = acc_type;
        this.sort_code = sort_code;
        this.number_Account = number_Account;
        this.customers = new ArrayList<Customer>();
    }

    @XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    @XmlElement
    public int getSort_code() {
        return sort_code;
    }

    public void setSort_code(int sort_code) {
        this.sort_code = sort_code;
    }

    @XmlElement
    public int getNumber_Account() {
        return number_Account;
    }

    public void setNumber_Account(int number_Account) {
        this.number_Account = number_Account;
    }

    @XmlElement
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @XmlElement
    public String getType_Account() {
        return type_Account;
    }

    public void setType_Account(String type_Account) {
        this.type_Account = type_Account;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
