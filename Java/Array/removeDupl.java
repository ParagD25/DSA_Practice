package com;

public class removeDupl {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(remove(nums));
    }

    static int remove(int[] num){

        if (num.length==0){
            return 0;
        }

        int i=0;
        for (int j = 1; j < num.length; j++) {

            if (num[i]!=num[j]){
                i++;
                num[i]=num[j];
            }

        }
        return i+1;
    }
}
