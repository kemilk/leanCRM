package com.ironhack.leancrm;

import java.util.HashMap;

public class Account {
    private Integer id;
    private Industry industry;
    private Integer employeeCount;
    private String companyName;
    private String city;
    private String country;
    public static HashMap<Integer, Contact> contactList;
    private HashMap<Integer, Opportunity> opportunityList;

}
