package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

    public class EmployeeSalary {
        String name;
        int age;
        int salary;
        public EmployeeSalary(String name, int age, int salary)
        {
            this.name = name;
            this.age = age;
            this.salary=salary;
        }
        public String toString()
        {
            return this.name + " " + this.age + " " + this.salary;
        }
    }
    class sortbyemployeesalary implements Comparator<EmployeeSalary>
    {
        public int compare(EmployeeSalary a, EmployeeSalary b)
        {
            return a.salary - b.salary;
        }
    }
    class Main1
    {
        public static void main (String[] args)
        {
            ArrayList<EmployeeSalary> ar = new ArrayList<EmployeeSalary>();
            ar.add(new EmployeeSalary("sam", 40, 1000));
            ar.add(new EmployeeSalary("ram", 35, 40000));
            ar.add(new EmployeeSalary("raju", 49, 3000));
            System.out.println("Unsorted");
            for (int i=0; i<ar.size(); i++)
                System.out.println(ar.get(i));
            Collections.sort(ar, new sortbyemployeesalary());
            System.out.println("\nSorted by salary");
            for (int i=0; i<ar.size(); i++)
                System.out.println(ar.get(i));
        }
    }

