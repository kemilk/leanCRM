package com.ironhack.leancrm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    Contact testContact1;
    Contact testContact2;
    Opportunity testOpportunity1;
    Opportunity testOpportunity2;
    Account testAccount1;
    Account testAccount2;

    @BeforeEach
    void setUp() {
//        testContact1 = new Contact("Maier", "+49 (0) 30 / 123 456 789", "maier@zalando.de");
//        testContact2 = new Contact("Simmer", "+49 (0) 331 / 987 654 321", "simmer@siemens.de");
//        testOpportunity1 = new Opportunity(10, testContact1, Status.OPEN, Product.FLATBED);
//        testOpportunity2 = new Opportunity(20, testContact2, Status.OPEN, Product.HYBRID);
//        testAccount1 = new Account(1, Industry.ECOMMERCE, 15000, "Zalando", "Berlin", "Germany", testContact1, testOpportunity1);
//        testAccount2 = new Account(2, Industry.MANUFACTURING, 200000, "Siemens", "München", "Germany", testContact2, testOpportunity2);
    }

    @Test
    void constructorWithExistingAccountAndExistingOpportunity() {
    }

    @Test
    void constructorNewAccountAndExistingOpportunity() {
    }

    @Test
    void constructorWithExistingAccountAndNewOpportunity() {
    }

    @Test
    void constructorNewAccountAndNewOpportunity() {
        //(String name, String phoneNumber, String email, Integer accountID, Industry accountIndustry, Integer accountEmployeeCount, String accountCompanyName, String accountCity, String accountCountry, Integer opportunityQuantity, Status opportunityStatus, Product opportunityProduct)
        Contact testContact1 = new Contact("Maier", "+49 (0) 30 / 123 456 789", "maier@zalando.de", 1, Industry.MANUFACTURING, 200000, "Siemens", "München", "Germany",10, Status.OPEN, Product.FLATBED);
        assertEquals("Maier", testContact1.getName());
    }



    @Test
    void getId() {
    }

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void getPhoneNumber() {
    }

    @Test
    void setPhoneNumber() {
    }

    @Test
    void getEmail() {
    }

    @Test
    void setEmail() {
    }

    @Test
    void getAccount() {
    }

    @Test
    void setAccount() {
    }

    @Test
    void getOpportunityMap() {
    }

    @Test
    void addOpportunity() {
    }

    @Test
    void getContactMap() {
    }

}