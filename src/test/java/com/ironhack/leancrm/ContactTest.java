package com.ironhack.leancrm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    Contact testContact1;
    Contact testContact2;
    Contact testContact3;
    Opportunity testOpportunity1;
    Opportunity testOpportunity2;
    Opportunity testOpportunity3;
    Account testAccount1;
    Account testAccount2;
    Account testAccount3;

    @BeforeEach
    void setUp() {
//        testContact1 = new Contact("Maier", "+49 (0) 30 / 123 456 789", "maier@zalando.de", 1, Industry.ECOMMERCE, 15000, "Zalando", "Berlin", "Germany",10, Status.OPEN, Product.FLATBED);
//        testContact2 = new Contact("Simmer", "+49 (0) 331 / 987 654 321", "simmer@siemens.de", 2, Industry.MANUFACTURING, 200000, "Siemens", "München", "Germany",20, Status.OPEN, Product.HYBRID);
//        testAccount1 = testContact1.getAccount();
//        testAccount2 = testContact2.getAccount();
//        testOpportunity1 = testContact1.getOpportunityMap().get(0);
//        testOpportunity1 = testContact1.getOpportunityMap().get(1);
    }

    @Test
    void constructorWithExistingAccountAndExistingOpportunity() {
        testContact3 = new Contact("Schulze", "040 56 12 89 65 23", "Schulze@zalando.de");
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
        testContact1 = new Contact("Maier", "+49 (0) 30 / 123 456 789", "maier@zalando.de", Industry.ECOMMERCE, 15000, "Zalando", "Berlin", "Germany",10, Status.OPEN, Product.FLATBED);
        assertEquals("Maier", testContact1.getName());
    }

    @Test
    void getId() {
        testContact1 = new Contact("Maier", "+49 (0) 30 / 123 456 789", "maier@zalando.de", Industry.ECOMMERCE, 15000, "Zalando", "Berlin", "Germany",10, Status.OPEN, Product.FLATBED);
        assertEquals(0, testContact1.getId());
        assertNotEquals(5, testContact1.getId());
        testContact2 = new Contact("Simmer", "+49 (0) 331 / 987 654 321", "simmer@siemens.de", Industry.MANUFACTURING, 200000, "Siemens", "München", "Germany",20, Status.OPEN, Product.HYBRID);
        assertEquals(1, testContact1.getId());
        assertNotEquals(5, testContact1.getId());
    }

    @Test
    void getName() {
        testContact1 = new Contact("Maier", "+49 (0) 30 / 123 456 789", "maier@zalando.de", Industry.ECOMMERCE, 15000, "Zalando", "Berlin", "Germany",10, Status.OPEN, Product.FLATBED);
        assertEquals("Maier", testContact1.getName());
        assertNotEquals("Schmidt", testContact1.getName());
    }

    @Test
    void setName() {
        testContact1 = new Contact("Maier", "+49 (0) 30 / 123 456 789", "maier@zalando.de", Industry.ECOMMERCE, 15000, "Zalando", "Berlin", "Germany",10, Status.OPEN, Product.FLATBED);
        assertEquals("Maier", testContact1.getName());
        assertNotEquals("Schmidt", testContact1.getName());
        testContact1.setName("Schmidt");
        assertEquals("Schmidt", testContact1.getName());
        assertNotEquals("Maier", testContact1.getName());
    }

    @Test
    void getPhoneNumber() {
        testContact1 = new Contact("Maier", "+49 (0) 30 / 123 456 789", "maier@zalando.de", Industry.ECOMMERCE, 15000, "Zalando", "Berlin", "Germany",10, Status.OPEN, Product.FLATBED);
        assertEquals("+49 (0) 30 / 123 456 789", testContact1.getPhoneNumber());
        assertNotEquals("+49 (0) 30 / 123 456 112", testContact1.getPhoneNumber());
    }

    @Test
    void setPhoneNumber() {
        testContact1 = new Contact("Maier", "+49 (0) 30 / 123 456 789", "maier@zalando.de", Industry.ECOMMERCE, 15000, "Zalando", "Berlin", "Germany",10, Status.OPEN, Product.FLATBED);
        assertEquals("+49 (0) 30 / 123 456 789", testContact1.getPhoneNumber());
        assertNotEquals("+49 (0) 30 / 123 456 112", testContact1.getPhoneNumber());
        testContact1.setPhoneNumber("+49 (0) 30 / 123 456 112");
        assertEquals("+49 (0) 30 / 123 456 112", testContact1.getPhoneNumber());
        assertNotEquals("+49 (0) 30 / 123 456 789", testContact1.getPhoneNumber());
    }

    @Test
    void getEmail() {
        testContact1 = new Contact("Maier", "+49 (0) 30 / 123 456 789", "maier@zalando.de", Industry.ECOMMERCE, 15000, "Zalando", "Berlin", "Germany",10, Status.OPEN, Product.FLATBED);
        assertEquals("maier@zalando.de", testContact1.getEmail());
        assertNotEquals("mayer@zalando.de", testContact1.getEmail());
    }

    @Test
    void setEmail() {
        testContact1 = new Contact("Maier", "+49 (0) 30 / 123 456 789", "maier@zalando.de", Industry.ECOMMERCE, 15000, "Zalando", "Berlin", "Germany",10, Status.OPEN, Product.FLATBED);
        assertEquals("maier@zalando.de", testContact1.getEmail());
        assertNotEquals("mayer@zalando.de", testContact1.getEmail());
        testContact1.setEmail("mayer@zalando.de");
        assertEquals("mayer@zalando.de", testContact1.getEmail());
        assertNotEquals("maier@zalando.de", testContact1.getEmail());
    }

    @Test
    void getAccount() {
        testContact1 = new Contact("Maier", "+49 (0) 30 / 123 456 789", "maier@zalando.de", Industry.ECOMMERCE, 15000, "Zalando", "Berlin", "Germany",10, Status.OPEN, Product.FLATBED);
        testAccount1 = testContact1.getAccount();
        assertEquals(testAccount1, testContact1.getAccount());
        assertNotEquals(testAccount2, testContact1.getAccount());
    }

    @Test
    void setAccount() {
        testContact1 = new Contact("Maier", "+49 (0) 30 / 123 456 789", "maier@zalando.de", Industry.ECOMMERCE, 15000, "Zalando", "Berlin", "Germany",10, Status.OPEN, Product.FLATBED);
        testAccount1 = testContact1.getAccount();
        assertEquals(testAccount1, testContact1.getAccount());
        assertNotEquals(testAccount2, testContact1.getAccount());
        testContact1.setAccount(testAccount2);
        assertEquals(testAccount2, testContact1.getAccount());
        assertNotEquals(testAccount1, testContact1.getAccount());
    }

    @Test
    void getOpportunityMap() {
    }

    @Test
    void addOpportunity() {
    }

    @Test
    void getContactMap() {
//        testContact1 = new Contact("Maier", "+49 (0) 30 / 123 456 789", "maier@zalando.de", 1, Industry.ECOMMERCE, 15000, "Zalando", "Berlin", "Germany",10, Status.OPEN, Product.FLATBED);
//        testContact2 = new Contact("Simmer", "+49 (0) 331 / 987 654 321", "simmer@siemens.de", 2, Industry.MANUFACTURING, 200000, "Siemens", "München", "Germany",20, Status.OPEN, Product.HYBRID);
//        assertEquals(new HashMap<>(),Contact.getContactMap());
//        assertEquals(new HashSet<>(Arrays.asList(testAccount1, testAccount2)), Account.getAccountSet());
    }

}