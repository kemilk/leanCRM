package com.ironhack.leancrm;

public class Opportunity {
    private Integer id;
    private Integer quantity;
    private Contact decisionMaker;
    private Status status;
    private Product product;


    // Constructer

    public Opportunity(Integer id, Integer quantity, Contact decisionMaker, Status status, Product product) {
        setId(id);
        setQuantity(quantity);
        setDecisionMaker(decisionMaker);
        setStatus(status);
        setProduct(product);
    }

    // Getter and Setter

    public Integer getId() {
        return id;
    }
    public void setId(Lead lead) {
        this.id = id;
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
}

