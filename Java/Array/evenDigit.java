package com;

public class evenDigit {
    public static void main(String[] args) {
        int[] nums1 = {12,345,2,6,7896};
        int[]  nums2={555,901,482,1771};
        System.out.println(even(nums2));
    }

    static int even(int[] nums) {
        int res=0;
        for (int i = 0; i < nums.length ; i++) {
            int count=0;
            int arrnum=nums[i];
            while(arrnum>0){
                arrnum=arrnum/10;
                count++;
            }

            if(count%2==0){
                res++;
            }

        }
        return res;
    }
}
