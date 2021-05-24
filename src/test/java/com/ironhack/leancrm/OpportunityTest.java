package com.ironhack.leancrm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpportunityTest {

    @Test
    void setIdTest() {
        Opportunity opp1 = new Opportunity(23,new Contact("Klara Korn","+49 30 345 6789","klara.korn@niwwieweg.de"),Status.OPEN,Product.BOX);
        Opportunity opp2 = new Opportunity(56,new Contact("Lola Rennt","+49 40 678 6990","lola.rennt@AllesBesser.de"),Status.CLOSED_LOST,Product.FLATBED);

        assertEquals(1, opp1.getId());
        assertEquals(2, opp2.getId());
    }
}