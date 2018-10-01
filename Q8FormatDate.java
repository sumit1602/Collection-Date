package com.company;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Q8FormatDate {
    public static void main(String[] args) {
        SimpleDateFormat sd = new SimpleDateFormat("dd-MMM-YYYY");
        String date=sd.format(new Date());
        System.out.println(date);
    }
}
