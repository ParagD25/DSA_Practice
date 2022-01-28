package com.first;

import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner curr=new Scanner(System.in);

        System.out.print("Enter Currency in rupee:");
        double inr=curr.nextDouble();
        double usd=inr*0.013;
        System.out.println("USD = "+usd);

    }
}
