package com.nciwebapi.groupone;

import java.util.ArrayList;
import java.util.List;

public class Account{
    private int id, customer_id, sort_code, number_Account;
    private double balance;
    private String type_Account;
    private List<Customer> customers;
    public Account(){
}
public Account(int id, int customer_id, double balance, String acc_type, int sort_code, int acc_num){
   this.id = id;
   this.customer_id = customer_id;
   this.balance = balance;
   this.type_Account = acc_type;
   this.sort_code = sort_code;
   this.number_Account = number_Account;
   this.customers = new ArrayList<Customer>();
    }
   public int getId(){
      return id;
}

   public void setId(int id){
      this.id = id;
}

   public int getCustomer_id(){
      return customer_id;
}

   public void setCustomer_id(int customer_id){
      this.customer_id = customer_id;
}
   public double getBalance(){
      return balance;
}

   public void setBalance(double balance){
      this.balance = balance;
}

   public String getAcc_type(){
      return type_Account;
}
   public void setAcc_type(String type_Account){
      this.type_Account = type_Account;
}

   public int getSort_code(){
      return sort_code;
}
   public void setSort_code(int sort_code){
      this.sort_code = sort_code;
}

   public int getAcc_num(){
      return number_Account;
}

   public void setAcc_num(int number_Account){
      this.number_Account = number_Account;
}
   public List<Customer> getCustomer(){
      return customers;
}
   public void setCustomers(List<Customer> customers){
      this.customers = customers;
    }
}