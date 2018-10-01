package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Q2UniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String input = sc.next();

//        System.out.println(countUniqueChar(input));
//    }
//        public static int countUniqueChar (String input){
//            char ch[] = input.toCharArray();
//            HashSet<Character> hs = new HashSet<Character>();
//            for (int i = 0; i < ch.length; i++) {
//                hs.add(ch[i]);
//            }
//            return hs.size();
//        }
//    }
        char ch[]= input.toCharArray();
        Map<Character, Integer> hm= new HashMap<>();
        for(int i=0; i<ch.length; i++){
            if(!hm.containsKey(ch[i]))
                hm.put(ch[i],0);
            if(hm.containsKey(ch[i]))
                hm.put(ch[i],hm.get(ch[i])+1);
        }
        int count=0;
        for(Map.Entry<Character, Integer> entry: hm.entrySet()){
            if(entry.getValue()==1){
                count++;
                System.out.println(entry.getKey());
        }
         }
        System.out.println("total number of unique character in a string are : " +count);
    }
}

