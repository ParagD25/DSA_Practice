package com;

public class diagonalSum {
    public static void main(String[] args) {
        int[][] mat1 = {{1,2,3},{4,5,6}, {7,8,9}};
        int[][] mat2 = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int[][] mat3 = {{5}};
        diagonalSum(mat2);
    }

    static void diagonalSum(int[][] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i][i];
            if (i!=arr.length-1-i){
                sum+=arr[i][arr.length-1-i];
            }
        }
        System.out.println("Sum : "+sum);
    }
}
