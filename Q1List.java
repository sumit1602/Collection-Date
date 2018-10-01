package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q1List {
    public static void main(String[] args) {
        List<Float> li = new ArrayList<>();
        li.add(2.5f);
        li.add(2.0f);
        li.add(2.5f);
        li.add(3.0f);
        li.add(2.0f);
        float sum =0;
        for(Float i:li){
            sum=sum+i;
        }
        System.out.println(sum);

        //adding all number in list by using iterator()
        float sum1=0;
        Iterator itr = li.iterator();
        while(itr.hasNext()){
            Float j =(Float)itr.next();
            sum1=sum1+j;
        }
        System.out.println(sum1);
    }
}
