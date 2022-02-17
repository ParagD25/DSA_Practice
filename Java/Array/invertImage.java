package com;

import java.util.Arrays;

public class invertImage {

    public static void main(String[] args) {
        int[][] image = {{1,0,1,1},{0,0,0,1},{1,0,0,1},{0,1,1,1}};
        flipImage(image);
    }

    static void flipImage(int[][] arr){
        for (int i = 0; i <arr.length ; i++) {
            int fp=0;
            int lp=arr[i].length-1;
            while (fp<lp){
                int temp=arr[i][fp];
                arr[i][fp]=arr[i][lp];
                arr[i][lp]=temp;
                fp++;
                lp--;
            }
            for (int j = 0; j < arr[i].length; j++) {
                 if (arr[i][j]==0){
                     arr[i][j]=1;
                 }
                 else {
                     arr[i][j] = 0;
                 }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
