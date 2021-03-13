package com.richie;

public class Customer {

    public static void main(String[] args) {
        A[] As = {
                new A("0013", 490, 0, 490),
                new A("0052", 1000, 100, 900),
                new A("0081", 290, 0, 290),
                new A("2122", 2000, 200, 1800),
        };
        for (int i = 0; i < As.length; i++) {
            As[i].print();
            System.out.println(As);
        }
    }
}