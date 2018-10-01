package com.company;

        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Comparator;

public class Q5EmployeeSalary {
    String name;
    int age;
    int salary;
    public Q5EmployeeSalary(String name, int age, int salary)
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
class sortbyemployeesalary1 implements Comparator<Q5EmployeeSalary>
{
    public int compare(Q5EmployeeSalary a, Q5EmployeeSalary b)
    {
        return a.salary - b.salary;
    }
}
class Main_2
{
    public static void main (String[] args)
    {
        ArrayList<Q5EmployeeSalary> ar = new ArrayList<Q5EmployeeSalary>();
        ar.add(new Q5EmployeeSalary("sam", 40, 1000));
        ar.add(new Q5EmployeeSalary("ram", 35, 40000));
        ar.add(new Q5EmployeeSalary("raju", 49, 3000));
        System.out.println("Unsorted");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
        Collections.sort(ar, new sortbyemployeesalary1());
        System.out.println("\nSorted by salary");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
    }
}