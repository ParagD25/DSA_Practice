package com;

public class transpose {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        trans(matrix);
    }

    static void trans(int[][] arr){
        int[][] transarray=new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                transarray[i][j]=arr[j][i];
                System.out.print(transarray[i][j]+" ");
            }
            System.out.println();
        }

    }
}
