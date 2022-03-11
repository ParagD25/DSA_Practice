package com;

import java.util.Arrays;

public class nunique {
    public static void main(String[] args) {
        int n=5;
        System.out.println(Arrays.toString(nuni(n)));
    }

    static int[] nuni(int n){
        int[] res = new int[n];
        for(int i=0; i<n; i++) {
            res[i]  = (i*2)-n+1;
        }
        return res;
    }
}
