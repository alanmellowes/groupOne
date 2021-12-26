/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nciwebapi.groupone;

/**
 *
 * @author Alan.Mellowes
 */
public class Customer {
    private int id;
    private String name, password,address, email;

public Customer(){
} 

public Customer(int account_id, String name, String password, String address, String email){
       this.id = account_id;
       this.name = name;
       this.password = password;
       this.address = address;
       this.email = email;
    }

public int getId(){
}
}
