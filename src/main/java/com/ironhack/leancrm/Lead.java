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
