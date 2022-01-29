package loops;

import java.util.Scanner;

public class p_and_s {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter Num : ");
        int num=in.nextInt();
        int prod=1;
        int sum=0;

        while (num>0){
            prod*=(num%10);
            sum+=(num%10);
            num/=10;

        }

        System.out.print("Answer " +(prod-sum));

    }
}
