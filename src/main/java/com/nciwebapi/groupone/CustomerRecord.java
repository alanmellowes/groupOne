package com.nciwebapi.groupone;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerRecord {

    private int id;
    private String name;
    private ArrayList<com.nciwebapi.groupone.Account> acc;

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

    public ArrayList<Account> getAcc() {
        return acc;
    }

    public void setAcc(ArrayList<Account> acc) {
        this.acc = acc;
    }

}
