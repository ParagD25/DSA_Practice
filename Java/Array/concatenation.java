package com;

import java.util.Arrays;

public class concatenation {
    public static void main(String[] args) {
        int[] arr={1,3,2,1};
        System.out.println(Arrays.toString(conc(arr)));


    }

    static int[] conc(int[] arr){
        int[] newarr=new int[arr.length*2];
        int len=arr.length;
        int i=0;
        while (i<len){
            newarr[i+len]=arr[i];
            newarr[i]=arr[i];
            i++;
        }
        return newarr;

    }
}
