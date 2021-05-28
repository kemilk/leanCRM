package com.ironhack.leancrm;

import com.ironhack.leancrm.common.Utils;

import java.util.HashMap;

public class Opportunity {
    private Integer id;
    private Integer quantity;
    private Contact decisionMaker;
    private Status status;
    private Product product;
    //class var for having an overview of all Opportunity objects
    public static HashMap<Integer, Opportunity> opportunityMap = new HashMap<>();


    // Constructer

    public Opportunity(Integer quantity, Contact decisionMaker, Status status, Product product) {
        setQuantity(quantity);
        setDecisionMaker(decisionMaker);
        setStatus(status);
        setProduct(product);
        this.id = Utils.getNextId(opportunityMap);
        opportunityMap.put(this.getId(), this);
    }

    // Getter and Setter

    public Integer getId() {
        return id;
    }

    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Contact getDecisionMaker() {
        return decisionMaker;
    }
    public void setDecisionMaker(Contact decisionMaker) {
        this.decisionMaker = decisionMaker;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }


    @Override
    public String toString() {
        return "Opportunity with ID " + id +
                "\n" + "Quantity: " + quantity +
                "\n" + "DecisionMaker: " + decisionMaker.getName() +
                "\n" + "Status: " + status +
                "\n" + "Product: " + product +
                "\n";
    }
}

