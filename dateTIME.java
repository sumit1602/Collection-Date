package com.company;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.*;

public class dateTIME {

//
//    int hour;
//    int min;
//    int sec;
//    String year;
//    String date;
//    String month;
//
//    public dateTIME(int hour, int min, int sec, String year, String date, String month) {
//        this.hour = hour;
//        this.min = min;
//        this.sec = sec;
//        this.year = year;
//        this.date = date;
//        this.month = month;
//    }



    public static void main(String[] args) {
//        Date d = new Date(2018,9,27,12,53,22);
//        System.out.println(d);
//        Date d2 = new Date();
//        System.out.println(System.currentTimeMillis());
//        long d1=System.currentTimeMillis();
//        System.out.println(d1);

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY");
        String date = df.format(new Date());
        System.out.println(date);
//        SimpleDateFormat d3 = new SimpleDateFormat("dd/mm/yyyy");
//        String date1 = d3.format(new Date());
//        System.out.println(date1);
//        Calendar c= Calendar.getInstance();
//
//        System.out.println(c.getTime());
//        ZonedDateTime zd = ZonedDateTime.parse("2008-12-03[asia/karachi]");
//        System.out.println(zd);


           //vector example
// int[] arr={1,2,3,4};
//        Vector v= new Vector();
//        Hashtable<Integer,String> ht= new Hashtable<>();
//        v.addElement(1);
//        v.addElement(9);
//        v.addElement(8);
//        ht.put(1,"sumit");
//        ht.put(2,"rohit");
//        ht.put(3,"amit");
//        System.out.println(v);
//        System.out.println(ht);
//        System.out.println(arr[0]);
//        System.out.println(v.capacity());
//        System.out.println(v.elementAt(2));
//        System.out.println(ht.get("3"));


        // iterator & Enumeration example
//        for(int i=0; i<10; i++){
//           v.addElement(i++);
//       }
//        System.out.println(v);
//        Enumeration e =v.elements();
//        while(e.hasMoreElements()){
//            int i =(Integer)e.nextElement();
//            System.out.print(i+" ");
//        }
//

//        ArrayList ar = new ArrayList();
//        for(int i=0; i<10; i++){
//            ar.add(i);
//        }
//        System.out.println(ar);
//        Iterator it=ar.iterator();
//        while(it.hasNext()){
//            int i=(Integer)it.next();
//            System.out.print(i+" ");
//        }


//        List<Integer> a = new ArrayList<Integer>();
//        a.add(0,1);
//        a.add(1,3);
//        a.add(2,2);
//        System.out.println(a);
//        List<Integer> b = new ArrayList<Integer>();
//        b.add(1);
//        b.add(14);
//        b.add(16);
//        b.add(18);
//        b.add(181);
//        b.add(128);
//        System.out.println(b);
//        b.remove(2);
//        System.out.println(b.get(1));
//        System.out.println(a.indexOf(2));
//        System.out.println(b.subList(2,5));
//        List<Integer> c = new ArrayList<>();
//        c =(List)((ArrayList<Integer>) b).clone();
//        System.out.println(c);
//
//        Vector vec = new Vector(7);
//        Vector vecretain = new Vector(4);
//        vec.add(1);
//        vec.add(14);
//        vec.add(13);
//        vec.add(12);
//        vec.add(11);
//
//
//        vecretain.add(1);
//        vecretain.add(1222);
//        vecretain.add(11);
//
//        vec.retainAll(vecretain);
//        Iterator itr = vec.iterator();
//        while(itr.hasNext()) {
//            System.out.println(itr.next());
//        }
//        System.out.println(vec.hashCode());

        Clock clock= Clock.systemUTC();
        System.out.println(clock.instant());

    }
}
