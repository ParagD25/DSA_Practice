package com.first;

import java.util.Locale;
import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {

        Scanner st=new Scanner(System.in);
        String empty="";
        String name=st.nextLine();
        int stringl=name.length();
        for (int i=stringl-1;i>=0;--i){
            empty=empty+name.charAt(i);
        }

        if (name.toLowerCase().equals(empty.toLowerCase())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

}
