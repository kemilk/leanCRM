package com.ironhack.leancrm;

import com.ironhack.leancrm.common.Utils;

import java.util.HashMap;

public class Contact {
    //Contact parameters
    private Integer id;
    private String name;
    private String phoneNumber;
    private String email;
    private Account account;
    private  static HashMap<Integer, Opportunity> leadMap = new HashMap<>();
    //class var for having an overview of all Contact objects
    public static HashMap<Integer, Contact> contactMap = new HashMap<>();

    //!!! with new Contact the company info from Lead must be taken to create new Account object if not already exists


    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.id = Utils.getNextId(contactMap);
    }
}
