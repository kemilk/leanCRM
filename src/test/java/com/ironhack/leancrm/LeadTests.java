package com.ironhack.leancrm;

import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeadTests {

    //create test leads
    //lead objects
    Lead l1 = new Lead("Martin Klausen","+49 172 56 3457 88", "martin.klausen@nixwieweg.com", "nix wie weg AG");
    Lead l2 = new Lead("Sandra Leopold","+49 2305 72 345 7878", "sandra.leopold@nirvans.de", "Nirvans GmbH");

    @Test
    @Description("this test checks the addNewLead method + the showLeads method")
    void showLeadsTest() {
        assertEquals(2,Lead.showLeads().size());
        assertEquals("+49 172 56 3457 88", Lead.showLeads().get(0).getPhoneNumber());
        assertEquals("sandra.leopold@nirvans.de", Lead.showLeads().get(1).getEmail());

    }
    @Test
    @Description("this test checks the lookUpLead method => retrieve on single lead by id")
    void lookUpLeadTest() {
        assertEquals(l1, Lead.lookUpLead(l1.getId()));
    }

}