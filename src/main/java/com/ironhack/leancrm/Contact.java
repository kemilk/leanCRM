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
    private HashMap<Integer, Opportunity> opportunityMap = new HashMap<>();

    //class var for having an overview of all Contact objects
    public static HashMap<Integer, Contact> contactMap = new HashMap<>();

    //Contructor if Account and Opportunity are known
    public Contact(String name, String phoneNumber, String email, Account account, Integer opportunityID, Opportunity opportunity) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.account = account;
        this.opportunityMap.put(opportunityID, opportunity);
        this.id = Utils.getNextId(contactMap);
    }
    //Contructor if Account is known and Opportunity is to create
    public Contact(String name, String phoneNumber, String email, Account account, Integer opportunityQuantity, Status opportunityStatus, Product opportunityProduct) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.account = account;
        Opportunity opportunity = new Opportunity(opportunityQuantity, this, opportunityStatus, opportunityProduct);
        this.opportunityMap.put(opportunity.getId(), opportunity);
        this.id = Utils.getNextId(contactMap);
    }
    //Contructor if Account is to create and Opportunity is known
    public Contact(String name, String phoneNumber, String email, Integer opportunityID, Opportunity opportunity, Integer accountID, Industry accountIndustry, Integer accountEmployeeCount, String accountCompanyName, String accountCity, String accountCountry) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.account = new Account(accountID, accountIndustry, accountEmployeeCount, accountCompanyName, accountCity, accountCountry, this, opportunity);
        this.opportunityMap.put(opportunityID, opportunity);
        this.id = Utils.getNextId(contactMap);
        contactMap.put(this.id,this);
    }

    //Contructor if Account and Opportunity are to create
    public Contact(String name, String phoneNumber, String email, Integer accountID, Industry accountIndustry, Integer accountEmployeeCount, String accountCompanyName, String accountCity, String accountCountry, Integer opportunityQuantity, Status opportunityStatus, Product opportunityProduct) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        Opportunity opportunity = new Opportunity(opportunityQuantity, this, opportunityStatus, opportunityProduct);
        this.opportunityMap.put(opportunity.getId(), opportunity);
        this.account = new Account(accountID, accountIndustry, accountEmployeeCount, accountCompanyName, accountCity, accountCountry, this, opportunity);
        this.id = Utils.getNextId(contactMap);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public HashMap<Integer, Opportunity> getOpportunityMap() {
        return opportunityMap;
    }

    public void addOpportunity(Integer opportunityID, Opportunity opportunity) {
        this.opportunityMap.put(opportunityID, opportunity);
    }

    public static HashMap<Integer, Contact> getContactMap() {
        return contactMap;
    }

}
