package com.first;

import java.util.Scanner;

public class fibb {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int a=0;
        int b=1;
        int num=n.nextInt();

        int val=0;
        for (int i=2;i<num;i++){
            val=a+b;
            System.out.println(val);
            a=b;
            b=val;


        }

    }
}
