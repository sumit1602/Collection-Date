package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Q4EmployeeHighestSalary implements Comparator<Q4EmployeeHighestSalary> {
    String name;
    Double salary;
    Double Age;

    public Q4EmployeeHighestSalary(String name, Double salary, Double age) {
        this.name = name;
        this.salary = salary;
        Age = age;
    }


//    @Override
//    public int compare(Q4EmployeeHighestSalary s) {
//        if(s.salary>this.salary)
//        return 1;
//        else
//            return -1;
//    }

    @Override
    public String toString() {
        return "Q4EmployeeHighestSalary{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", Age=" + Age +
                '}';
    }

    @Override
    public int compare(Q4EmployeeHighestSalary s1, Q4EmployeeHighestSalary s2) {
        if (s1.salary > s2.salary)
            return 1;
        else {
            return -1;
        }
    }
//    @Override
//    public int compare(Q4EmployeeHighestSalary s1, Q4EmployeeHighestSalary s2) {
//       int flag =(int)(s1.salary-s2.salary);
//        if(flag==0)
//            flag= this.name.compareTo(name);
//       return flag;
//    }
//}
}
class com {
    public static void main(String[] args) {
        ArrayList<Q4EmployeeHighestSalary > li= new ArrayList();
        li.add(new Q4EmployeeHighestSalary("sumit", 100000.0,23.0));
        li.add(new Q4EmployeeHighestSalary("amit", 400000.0,23.0));
        li.add(new Q4EmployeeHighestSalary("rohit", 200000.0,24.0));
        li.add(new Q4EmployeeHighestSalary("shivt", 300000.0,25.0));

               for(Q4EmployeeHighestSalary e: li){
            System.out.println(e.salary);
        }
//        Collections.sort(li,new Q4EmployeeHighestSalary);
        System.out.println(li);


    }
}