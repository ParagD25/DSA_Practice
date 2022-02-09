package com;

import java.util.Arrays;

public class wealth {
    public static void main(String[] args) {
        int[][] arr= {{1,5},
                {7,3},
                {3,5}};
//        System.out.println(wealth(arr));
        System.out.println(wealth(arr));
    }

    static int wealth(int[][] arr){
        int high=0;
        for (int row = 0; row < arr.length ; row++) {
            int wea=0;
            for (int col = 0; col < arr[row].length; col++) {
                wea+=arr[row][col];
            }
            high=Math.max(wea,high);
        }
        return high;
    }
}
