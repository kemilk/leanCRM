package com.ironhack.leancrm;

import com.ironhack.leancrm.common.Utils;

import java.util.ArrayList;
import java.util.HashMap;

public class Lead {

    //Lead parameters
    private Integer id;
    private String name;
    private String phoneNumber;
    private String email;
    private String companyName;
    private  static HashMap<Integer, Lead> leadMap = new HashMap<>();

    public Lead(String name, String phoneNumber, String email, String companyName) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.companyName = companyName;
        this.id = Utils.getNextId(leadMap);
        this.addNewLead();
    }

    public void addNewLead(){
        leadMap.put(this.id, this);
    }

    public static ArrayList<Lead> showLeads() {
        ArrayList<Lead> returnLeadList = new ArrayList<>();
        for(Integer leadId : leadMap.keySet()) {
            returnLeadList.add(leadMap.get(leadId));
        }
        return returnLeadList;
    }

    public static Lead lookUpLead(Integer leadId) {
        return leadMap.get(leadId);
    }

    public static void convertToOpportunity(Integer leadId) {
        Lead leadToConvert = lookUpLead(leadId);

        // create new contact from lead info
        Contact createdContact = createContact(leadToConvert);

        //Integer oppInfoQuantity = Scan.getInfoForOpportunityQuantity();
        //Product oppInfoProduct = Scan.getInfoForOpportunityProduct();

      //  Opportunity createdOpportunity = createOpportunity(oppInfoQuantity, createdContact, oppInfoProduct);

        //industry, number of employees, city, and country
        //Industry accInfoIndustry = Scan.getInfoForAccountIndustry();
        //Integer accInfoEmployees = Scan.getInfoForAccountEmployees();
        //String accInfoCity = Scan.getInfoForAccountCity();
        //String accInfoCountry = Scan.getInfoForAccountCountry();
      //  Account createdAccount = createAccount(accInfoIndustry, accInfoEmployees, leadToConvert.getCompanyName(), accInfoCity, accInfoCountry, createdContact, createdOpportunity);

        //we have to remove the lead and to make everything clean again
        deleteLead(leadToConvert);

    }


    private static Opportunity createOpportunity(Integer quantity, Contact contact,Product product ){
        return new Opportunity(quantity, contact, Status.OPEN, product);
    }

    private static Contact createContact(Lead leadToConvert){
      //  return new Contact(leadToConvert.getName(),leadToConvert.getPhoneNumber(),leadToConvert.getEmail());
        return null;
    }
//(Integer id, Industry industry, Integer employeeCount, String companyName, String city, String country, Contact contact, Opportunity opportunity)
    private static Account createAccount(Industry industry, Integer employeeCount, String companyName, String city, String country, Contact contact, Opportunity opportunity){
        return new Account(industry, employeeCount, companyName, city, country, contact, opportunity);
    }

    private static void deleteLead(Lead leadToDelete) {
        leadMap.remove(leadToDelete.id);
    }

    //setter and getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }
}
