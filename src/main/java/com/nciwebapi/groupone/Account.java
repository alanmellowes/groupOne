<<<<<<< HEAD
=======

>>>>>>> 0a7fdb32d9673e81317920e5ba1399e612865078
package com.nciwebapi.groupone;

import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD

/**
 *
 * @author florm
 */
public class Account {

    private int id;
    private int customer_id;
    private double balance;
    private String type_Account;
    private int sort_code;
    private int number_Account;
    private List<Customer> customers;
=======
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Account {
>>>>>>> 0a7fdb32d9673e81317920e5ba1399e612865078

    public Account() {
    }

<<<<<<< HEAD
    public Account(int id, int customer_id, double balance, String acc_type, int sort_code, int acc_num) {
        this.id = id;
        this.customer_id = customer_id;
        this.balance = balance;
        this.type_Account = type_Account;
        this.sort_code = sort_code;
        this.number_Account = number_Account;
        this.customers = new ArrayList<Customer>();
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

=======
    public Account(int id, int customer_id, double balance, String account_type, int sort_code, int account_number) {
		this.id = id;
        this.customer_id = customer_id;
        this.balance = balance;
        this.account_type = account_type;
        this.sort_code = sort_code;
        this.account_number = account_number;
        this.customers = new ArrayList<Customer>();


    @XmlElement
    public String getAccount_type() {
        return acc_type;
    }

    public void getAccount_type(String acc_type) {
        this.acc_type = acc_type;
    }

    @XmlElement
    public int getSort_code() {
        return sort_code;
    }

    public void setSort_code(int sort_code) {
        this.sort_code = sort_code;
    }

    @XmlElement
    public int getAccount_num() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    @XmlElement
>>>>>>> 0a7fdb32d9673e81317920e5ba1399e612865078
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
<<<<<<< HEAD

    public String getAcc_type() {
        return type_Account;
    }

    public void setAcc_type(String type_Account) {
        this.type_Account = type_Account;
    }

    public int getSort_code() {
        return sort_code;
    }

    public void setSort_code(int sort_code) {
        this.sort_code = sort_code;
    }

    public int getAcc_num() {
        return number_Account;
    }

    public void setAcc_num(int number_Account) {
        this.number_Account = number_Account;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

}
=======
    
    
    public List<Customer> getCustomer() {
        return customers;
    }

    public void setCustomer(List<Customer> customers) {
        this.customers = customers;
    }
    
    public void addCustomer(Customer customer){
        
        this.customers.add(customer);
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
    
    private int id;
    private int customer_id;
    private double balance;
    private String account_type;
    private int sort_code;
    private int account_number;
    private List<Customer> customers;


}
>>>>>>> 0a7fdb32d9673e81317920e5ba1399e612865078
