package com.first;

import java.util.Scanner;

public class basic_calculator {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("Enter Number 1 :");
        float num1=num.nextFloat();
        System.out.println("Enter Number 2 : ");
        float num2=num.nextFloat();
        System.out.println("Enter Operator");
        char oper=num.next().charAt(0);
        float tot =0;
        if (oper =='+'){
             tot=num1+num2;
        }
        else if (oper =='-'){
             tot=num1-num2;
        }
        else if (oper =='*'){
             tot=num1*num2;
        }
        else if (oper =='/'){
             tot=num1/num2;
        }
        System.out.println(tot);
    }
}
