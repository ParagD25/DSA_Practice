package com.company;

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {

        Scanner num=new Scanner(System.in);
        System.out.println("Enter principal Amount : ");
        long p=num.nextLong();
        System.out.println("Enter Rate : ");
        int r= num.nextInt();
        System.out.println("Enter Time :");
        short t= num.nextShort();

        System.out.println("Simple Interest = "+(p*r*t));
    }
}
