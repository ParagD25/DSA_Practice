package com;

import java.util.Arrays;

public class runningSum {
    public static void main(String[] args) {
        int[] arr={3,1,2,10,1};
        System.out.println(Arrays.toString(running(arr)));


    }

    static int[] running(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;

    }

}
