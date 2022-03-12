package com;

import java.util.ArrayList;
import java.util.List;

public class lucky {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNum(matrix));
    }

    static List<Integer> luckyNum (int[][] matrix){

        List<Integer> arr=new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {

            int minIdx=0;
            int maxVal=99999;

            for (int j = 0; j < matrix[i].length; j++) {

                if(matrix[i][j]<maxVal){
                    maxVal=matrix[i][j];
                    minIdx=j;
                }
            }

            boolean check= true;


        }

    }
}
