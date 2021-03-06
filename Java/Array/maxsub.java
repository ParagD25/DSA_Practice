package com;

public class maxsub {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    static int maxSubArray(int[] nums) {
        int csum=nums[0];
        int osum=nums[0];

        for(int i=1;i<nums.length;i++){
            if(csum>=0){
                csum+=nums[i];
            }
            else{
                csum=nums[i];
            }

            if (csum>osum){
                osum=csum;
            }
        }
        return osum;

    }
}
