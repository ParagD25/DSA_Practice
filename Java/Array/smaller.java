package com;

public class smaller {
    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        int[] res=small(nums);
        System.out.println(res);
    }

    static int[] small(int[] arr) {
        int[] newarr=new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            int res=0;
            for (int j = 0; j < arr.length; j++) {
                if (i!=j && arr[i]>arr[j]){
                  res++;
                  newarr[i]=res;
                }
            }
        }
        return newarr;
    }
}
