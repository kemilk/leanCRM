package com.ironhack.leancrm.common;

import java.util.HashMap;

public class Contact {
    //Contact parameters
    private Integer id;
    private String name;
    private String phoneNumber;
    private String email;
    private Account account;
    private  static HashMap<Integer, Opportunity> leadMap = new HashMap<>();

    //!!! with new Contact the company info from Lead must be taken to create new Account object if not already exists


}
