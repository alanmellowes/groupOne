package com.nciwebapi.groupone;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Customer {

    private int id;
    private String name;
    private String password;
    private String address;
    private String email;

    public Customer() {
    }

    public Customer(int id, String name, String password, String address, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.address = address;
        this.email = email;
    }

    @XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlElement
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @XmlElement
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlRootElement(name = "Customers")
    public static class Customers {

        private List<Customer> cList;

        public Customers(List<Customer> list) {
            this.cList = list;
        }

        public List<Customer> getCustomerList() {
            return cList;
        }

        public void setCustomerList(List<Customer> cList) {
            this.cList = cList;
        }
    }
}
