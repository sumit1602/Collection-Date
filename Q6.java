//package com.company;
//
//public class Q6 {
//   static int x=0;
//    public static void main(String[] args) {
//
//            int arr[]={2,1,1,2,2,2,3,3,5,6,6,6,6};
//        int a[][]= new int[arr.length][2];
//
//        arr = sort(arr);
//
//        a[x][0] = arr[0];
//        for (int i=1; i<arr.length; i++){
//            if(arr[i]==arr[i-1]){
//                a[x][1]=a[x][1]+1;
//            }
//            else{
//                x++;
//                a[x][0]=arr[i];
//            }
//            x++;
//            a=sort(a);
//            for (int i=0; i<x; i++){
//                for(int j=0; j<a[i][1];j++){
//                    System.out.println(" "+a[i][0]);
//                }
//                System.out.println("");
//            }
//        }
//
////        for(int i: arr){
////            System.out.print(i);
////        }
//
//    }
//
//    public static int[][] sort(int a[][]){
//        int b[] =new int[2];
//        for(int i=0; i<x; i++){
//            for (int j=i; j<x; j++)
//            {
//                if (a[i][1]< b[j][1])
//                {
//                    b=a[i];
//                    a[j]=a[i];
//                    a[i]=b;
//                }
//            }
//        }
//        return a;
//    }
//
//
//    public static int[] sort(int arr[]){
//        for(int i=0; i<arr.length; i++){
//            for (int j=i; j<arr.length-1; j++){
//                if (arr[i] > arr[j]){
//                    int temp=arr[i];
//                    arr[j]=arr[i];
//                    arr[i]=temp;
//                }
//            }
//        }
//        return arr;
//    }
//
//
//}
