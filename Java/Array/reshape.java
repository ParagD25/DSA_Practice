package com;

public class reshape {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int r = 1;
        int c = 4;


    }

    static  int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length;
        int col=mat[0].length;

        if((row*col)!=(r*c)){
            return mat;
        }

        int[][] res=new int[r][c];
        int rnum=0;
        int cnum=0;

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                res[rnum][cnum]=mat[i][j];

                cnum++;

                if (cnum==c){
                    cnum=0;
                    rnum++;
                }

            }
            
        }
        return res;
    }

}
