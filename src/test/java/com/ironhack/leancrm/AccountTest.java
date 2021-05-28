package com.ironhack.leancrm;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Contact testContact1;
    Contact testContact2;
    Opportunity testOpportunity1;
    Opportunity testOpportunity2;
    Account testAccount1;
    Account testAccount2;

    @BeforeEach
    void setUp() {
        testContact1 = new Contact("Maier", "+49 (0) 30 / 123 456 789", "maier@zalando.de", Industry.ECOMMERCE, 15000, "Zalando", "Berlin", "Germany",10, Status.OPEN, Product.FLATBED);
        testContact2 = new Contact("Simmer", "+49 (0) 331 / 987 654 321", "simmer@siemens.de", Industry.MANUFACTURING, 200000, "Siemens", "München", "Germany",20, Status.OPEN, Product.HYBRID);
        testAccount1 = testContact1.getAccount();
        testAccount2 = testContact2.getAccount();
        testOpportunity1 = testContact1.getOpportunityMap().get(0);
        testOpportunity1 = testContact1.getOpportunityMap().get(1);
    }

//    @AfterEach
//    void afterEach() {
//        Account.clearAccountSet();
//    }
//
//    @Test
//    void addAccount() {
//        assertEquals(new HashSet<>(Arrays.asList(testAccount1, testAccount2)), Account.getAccountSet());
//    }
//
//    @Test
//    void getAccountSet() {
//        assertEquals(new HashSet<>(Arrays.asList(testAccount1, testAccount2)), Account.getAccountSet());
//    }

    @Test
    void getId() {
        assertEquals(testAccount1.getId(), 17);
        assertEquals(testAccount2.getId(), 18);
        assertNotEquals(testAccount1.getId(), 19);
    }

    @Test
    void getIndustry() {
        assertEquals(testAccount1.getIndustry(), Industry.ECOMMERCE);
        assertEquals(testAccount2.getIndustry(), Industry.MANUFACTURING);
        assertNotEquals(testAccount1.getIndustry(), Industry.MEDICAL);
    }

    @Test
    void setIndustry() {
        testAccount1.setIndustry(Industry.MEDICAL);
        assertEquals(testAccount1.getIndustry(), Industry.MEDICAL);
        assertNotEquals(testAccount1.getIndustry(), Industry.ECOMMERCE);
    }

    @Test
    void getEmployeeCount() {
        assertEquals(testAccount1.getEmployeeCount(), 15000);
        assertEquals(testAccount2.getEmployeeCount(), 200000);
        assertNotEquals(testAccount1.getEmployeeCount(), 10000);
    }

    @Test
    void setEmployeeCount() {
        testAccount1.setEmployeeCount(18000);
        assertEquals(testAccount1.getEmployeeCount(), 18000);
        assertNotEquals(testAccount1.getEmployeeCount(), 15000);
    }

    @Test
    void getCompanyName() {
        assertEquals(testAccount1.getCompanyName(), "Zalando");
        assertEquals(testAccount2.getCompanyName(), "Siemens");
        assertNotEquals(testAccount1.getCompanyName(), "Miele");
    }

    @Test
    void setCompanyName() {
        testAccount1.setCompanyName("Siemens AG");
        assertEquals(testAccount1.getCompanyName(), "Siemens AG");
        assertNotEquals(testAccount1.getCompanyName(), "Siemens");
    }

    @Test
    void getCity() {
        assertEquals(testAccount1.getCity(), "Berlin");
        assertEquals(testAccount2.getCity(), "München");
        assertNotEquals(testAccount1.getCity(), "Hamburg");
    }

    @Test
    void setCity() {
        testAccount1.setCity("Köln");
        assertEquals(testAccount1.getCity(), "Köln");
        assertNotEquals(testAccount1.getCity(), "Berlin");
    }

    @Test
    void getCountry() {
        assertEquals(testAccount1.getCountry(), "Germany");
        assertEquals(testAccount2.getCountry(), "Germany");
        assertNotEquals(testAccount1.getCountry(), "France");
    }

    @Test
    void setCountry() {
        testAccount1.setCountry("Italy");
        assertEquals(testAccount1.getCountry(), "Italy");
        assertNotEquals(testAccount1.getCountry(), "Germany");
    }

    @Test
    void getContactSet() {
        assertEquals(new HashSet<>(Arrays.asList(testContact1)), testAccount1.getContactSet());
    }

    @Test
    void addContact() {
        testAccount1.addContact(testContact2);
        assertEquals(new HashSet<>(Arrays.asList(testContact1, testContact2)), testAccount1.getContactSet());
    }

    @Test
    void getOpportunitySet() {
        assertEquals(1, testAccount1.getOpportunitySet().size());
    }

    @Test
    void addOpportunity() {
        testAccount1.addOpportunity(testOpportunity2);
        assertEquals(2, testAccount1.getOpportunitySet().size());
    }
}