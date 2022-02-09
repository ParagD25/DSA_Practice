package com;

public class target {
    public static void main(String[] args) {
        int[] num={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        System.out.println(getTarget(num,index));
    }

    static int[] getTarget(int[] num, int[] index) {
        int[] arr=new int[num.length];
        for (int i = 0; i < num.length; i++) {
            int val=index[i];
            int res=num[i];
            arr[val]=res;
        }






        return arr;
    }
}
