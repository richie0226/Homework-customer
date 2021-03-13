package com.richie;
public class A {
    String id;
    int price;
    int discount;
    int total;
    public A(String id, int price, int discount, int total) {
        this.id = id;
        this.price = price;
        this.discount = discount;
        this.total = total; }
    public void print() {
        System.out.println(id + "\t" + price + "\t" + discount + "\t" + total );
    }
}