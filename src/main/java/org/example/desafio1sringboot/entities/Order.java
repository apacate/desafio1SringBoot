package org.example.desafio1sringboot.entities;

public class Order {
    private double basic;
    private double discount;

    public Order() {
    }

    public Order(double basic, double discount) {
        this.basic = basic;
        this.discount = discount;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
