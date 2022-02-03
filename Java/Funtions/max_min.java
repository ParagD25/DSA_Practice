package funtions;

import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1= in.nextInt();
        System.out.print("Enter num2 : ");
        int num2= in.nextInt();
        System.out.print("Enter num3 : ");
        int num3= in.nextInt();
        int res1=max(num1,num2,num3);
        System.out.println("Maximum "+res1);
        int res2=min(num1,num2,num3);
        System.out.println("Minimum "+res2);

    }
    static int max(int num1,int num2,int num3){
        int x;
        if (num1>num2){
            x=num1;
            if (num1>num3){
                x=num1;
            }
            else{
                x=num3;
            }
        }
        else{
             x=num2;
            if (num2>num3){
                x=num2;
            }
            else{
                x=num3;
            }
        }
        return x;

    }

    static int min(int num1,int num2,int num3){
        int n;
        if (num1<num2){
            n=num1;
            if (num1<num3){
                n=num1;
            }
            else{
                n=num3;
            }
        }
        else{
            n=num2;
            if (num2<num3){
                n=num2;
            }
            else{
                n=num3;
            }
        }
        return n;

    }
}


