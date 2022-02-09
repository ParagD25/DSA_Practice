package com;

public class shuffle {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
    }

    static int[] shuffle(int[] arr,int n){
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[j];
            arr[i+1]=arr[j+ arr.length/2];
            i++;
            j++;

        }
        return arr;
    }
}
