package com.richie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try{
            Date d = sdf.parse("08:58");
            System.out.println(d);

        }catch (ParseException e){
            e.printStackTrace();
        }
        //
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());

        Car c1 = new Car("abc-123");
        Car c2 = new Car("xyz-888");
    }
}
