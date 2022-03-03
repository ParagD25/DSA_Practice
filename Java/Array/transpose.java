package com;

import java.util.Arrays;

public class transpose{
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.toString(trans(matrix)));
    }

    static int[][] trans(int[][] arr){
        int w = arr[0].length;
        int l = arr.length;
        int[][] resultarr = new int[w][l];
        for (int i = 0; i < w; i++){
            for (int j = 0; j < l; j++){
                resultarr[i][j] = arr[j][i];
            }
        }
        return resultarr;

    }

}
