package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Laptop implements Comparable<Laptop> {
    String name;
    int price;
    int age;

    public Laptop(String name, int price, int age) {
        this.name = name;
        this.price = price;
        this.age= age;
    }

    @Override
    public int compareTo(Laptop o) {
        if(this.price>o.price)
        return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", age=" + age +
                '}';
    }
}
class abc{
    public static void main(String[] args) {
        List<Laptop> li = new ArrayList<>();
        li.add(new Laptop("sumit",44444,23));
        li.add(new Laptop("amit",23444,22));
        li.add(new Laptop("rohit",24444,21));
        Collections.sort(li);
        for(Laptop l: li) {
            System.out.println(l);
        }
    }
}