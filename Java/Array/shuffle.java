package com;

import java.util.Arrays;

public class shuffle {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;

        System.out.println(Arrays.toString(shuffle(nums,n)));
    }

    static int[] shuffle(int[] arr,int n){
        int[] newarr=new int[n*2];
        for (int i = 0; i < n; i++) {
            newarr[2*i]=arr[i];
            newarr[2*i+1]=arr[i+n];

        }
        return newarr;
    }
}
