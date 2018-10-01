package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.zone.ZoneRulesException;
import java.util.Scanner;

public class Q9TimeCountryFormat {
    public static void main(String[] args) {

//        LocalDate ld=LocalDate.now().of(1995,2,16);
//        System.out.println(ld);


        //for printing all zone id of the world
        System.out.println("Available country timeZone");
        for(String s : ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }
        System.out.println("enter your country to know current time of your country:");
        Scanner sc= new Scanner(System.in);
        String place=sc.next();

        try{
            LocalTime lt=LocalTime.now(ZoneId.of(place));
            System.out.println(lt);
        }
     catch(ZoneRulesException e){
         System.out.println("Sorry your country doesn't exits");
     }
    }
}
