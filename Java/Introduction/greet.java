package com.company;

import java.util.Scanner;

public class greet {
    public static void main(String[] args) {

        Scanner name=new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String nm=name.nextLine();
        System.out.println("Hello"+" "+nm);

    }


}
