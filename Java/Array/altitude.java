package com;

public class altitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(alti(gain));
    }

    static int alti(int[] gain) {
        int val=0;
        int max=0;
        for (int i = 0; i < gain.length ; i++) {
            val+=gain[i];
            max=Math.max(val,max);
        }
        return max;

    }
}
