package com.first;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {

        Scanner num=new Scanner(System.in);
        System.out.print("Enter Num 1 : ");
        int num1=num.nextInt();

        System.out.print("Enter Num 2 : ");
        int num2=num.nextInt();

        if (num1>num2){
            System.out.println("Num1 is Greater");
        }
        else if (num2>num1){
            System.out.println("Num2 is Greater");
        }
        else{
            System.out.println("Both Are equal");
        }


    }
}
