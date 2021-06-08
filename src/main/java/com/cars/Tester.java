package com.cars;

import java.net.Socket;

public class Tester {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("ptt.cc",23);
            Socket socket = new Socket("tw.yahoo.com", 80);
            Socket socket = new Socket("www.ibm.com", 80);
        }
    }
}
