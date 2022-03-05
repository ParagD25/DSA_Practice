package com;

public class oddVal {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{0,1},{1,1}};

        System.out.println(getOdd(m,n,indices));
    }

    static int getOdd(int m,int n,int[][] arr){
        int countOdd=0;
        int[] row=new int[m];
        int[] col=new int[n];

        for (int i = 0; i <arr.length ; i++) {

            row[arr[i][0]]+=1;
            col[arr[i][1]]+=1;

        }

        for (int a = 0; a < m; a++) {

            for (int b = 0; b < n; b++) {

                if((row[a]+col[b])%2!=0){
                    countOdd++;
                }
            }
        }

        return countOdd;
    }
}
