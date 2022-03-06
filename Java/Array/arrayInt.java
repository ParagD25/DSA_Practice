package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arrayInt {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        System.out.println(addtoArray(num,k));

    }

//    static ArrayList<Integer> addtoArray(int[] arr,int n){
//        ArrayList<Integer> res=new ArrayList<>(10);
//        long mynum = 0;
//        int m=arr.length;
//        for (int i = 0; i < m ; i++) {
//            mynum+=arr[i]*Math.pow(10,m-1-i);
//        }
//        long total=mynum+n;
//        while (total>0){
//            long inp=total%10;
//            res.add((int) inp);
//            total/=10;
//        }
//        return reverse(res);
//
//    }
//
//    static ArrayList<Integer> reverse(ArrayList<Integer> res) {
//        int start=0;
//        int end=res.size()-1;
//        int temp=0;
//        while (start<end){
//            temp=res.get(start);
//            res.set(start,res.get(end));
//            res.set(end,temp);
//            start++;
//            end--;
//        }
//        return res;
//    }
//
//    static ArrayList<Integer> myArr(int[] arr,int n){
//        ArrayList<Integer> res=new ArrayList<>(10);
//        for (int i = arr.length-1; i >=0 ; i--) {
//            res.add(0,(arr[i]+n)%10);
//            n=(arr[i]+n)/10;
//
//        }
//        while (n>0){
//            res.add(0,n%10);
//            n=n/10;
//        }
//        return res;
//    }

//    static ArrayList<Integer> func(int[] arr,int n){
//        ArrayList<Integer> res=new ArrayList<>(10);
//        for (int i = arr.length; (n>0 && i>=0) ; i--) {
//            int digit=n%10;
//            n-=digit;
//
//            int sum=arr[i]+digit;
//            arr[i]=sum%10;
//            sum-=arr[i];
//
//            n+=sum;
//            n=n/10;
//        }
//        ArrayList<Integer> l=new ArrayList<>();
//
//        while(n>0){
//            l.add(0,n%10);
//            n=n/10;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            int x = arr[i];
//            l.add(x);
//        }
//        return l;
//    }


    static ArrayList<Integer> addtoArray(int[] arr,int k) {
        int n= arr.length;
        int i=n-1;
        ArrayList<Integer> res = new ArrayList<>();

        while(i>=0 || k>0){

            if(i>=0){
                res.add((arr[i]+k)%10);
                k=(arr[i]+k)/10;
            }

            else{
                res.add(k%10);
                k/=10;
            }

            i--;

        }
        Collections.reverse(res);


        return res;
    }
}
