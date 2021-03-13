package com.richie;

public class Customer {

    public static void main(String[] args) {
        Customer[] customers = {
                new Customer(id:"0013", price:490, discount:0, total:490),
                new Customer(id:"0052", price:1000, discount:100, total:900),
                new Customer(id:"0081", price:290, discount:0, total:290),
                new Customer(id:"2122", price:2000, discount:200, total:1800),
};
        for (int i = 0; i < Customer.length; i++) {
            customers[i].print();
        System.out.println(customers);
    }
}