package com;

import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(getsum(nums,target)));
    }

    static int[] getsum(int[] nums, int target) {
        int[] arr=new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]+nums[j]==target && i!=j){
                    arr[0]=i;
                    arr[1]=j;
                }

            }

        }
        return  arr;
    }
}
