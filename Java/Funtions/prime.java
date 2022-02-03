package funtions;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter num : ");
        int num= in.nextInt();

        primeno(num);
    }
    static void primeno(int num){
        int  count=0;
        for (int i=2;i<=Math.pow(num,0.5);i++){
            if (num%i==0){
                count+=1;
            }
        }
        if (count==0){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime");
        }

    }
}
