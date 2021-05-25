package com.ironhack.leancrm;

import java.util.HashSet;

public class Account {
    private Integer id;
    private Industry industry;
    private Integer employeeCount;
    private String companyName;
    private String city;
    private String country;
    private HashSet<Contact> contactSet;
    private HashSet<Opportunity> opportunitySet;

    private static HashSet<Account> accountSet = new HashSet<Account>();

    public static void addAccount(Integer id, Account account) {
            accountSet.add(account);
    }

    public static void listAccounts() {
        for (Account selected : Account.accountSet) {
            System.out.println(selected);
        }
    }

    public static HashSet<Account> getAccountSet() {
        return accountSet;
    }

    protected static void clearAccountSet() {
        Account.accountSet.clear();
    }

    public Account(Integer id, Industry industry, Integer employeeCount, String companyName, String city, String country, Contact contact, Opportunity opportunity) {
        this.id = id;
        this.industry = industry;
        this.employeeCount = employeeCount;
        this.companyName = companyName;
        this.city = city;
        this.country = country;
        this.contactSet = new HashSet<Contact>();
        this.addContact(contact);
        this.opportunitySet = new HashSet<Opportunity>();
        this.addOpportunity(opportunity);
        addAccount(id, this);
    }

    public Integer getId() {
        return id;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    public Integer getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(Integer employeeCount) {
        this.employeeCount = employeeCount;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public HashSet<Contact> getContactSet() {
        return contactSet;
    }

    public void listContacts() {
        for (Contact selected : this.contactSet) {
            System.out.println(selected);
        }
    }

    public void addContact(Contact contact) {
        this.contactSet.add(contact);
    }

    public HashSet<Opportunity> getOpportunitySet() {
        return opportunitySet;
    }

    public void listOpportunities() {
        for (Opportunity selected : this.opportunitySet) {
            System.out.println(selected);
        }
    }

    public void addOpportunity(Opportunity opportunity) {
        this.opportunitySet.add(opportunity);
    }
}
