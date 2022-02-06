package com;
import java.util.Arrays;
import java.util.Scanner;

public class permutation {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Length of array : ");
        int size= in.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= in.nextInt();
        }

        int[] res=perm(arr);
        System.out.println(Arrays.toString(res));
//        int[] arr={5,0,1,2,3,4};

    }

    static int[] perm(int[] arr){
        int[] newarr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int val=arr[i];
            int res=arr[val];
            newarr[val]=arr[res];
        }
        return newarr;

    }


}
