package com.baizhi.entity;

public class Order {
    private  String  id;
    private  String  name;
    private  Double  price;

    public Order() {
    }

    public Order(String id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
