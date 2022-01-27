package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class odd_or_even {

    public static void main(String[] args) {

        Scanner num= new Scanner(System.in);
        System.out.print("Enter Number : ");
        float number= num.nextInt();

        if (number%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}
