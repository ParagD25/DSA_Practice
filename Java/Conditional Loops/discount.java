package loops;

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Prize : ");
        int price= in.nextInt();
        System.out.print("Enter Discount : ");
        int dis= in.nextInt();
        int dp=price*dis/100;
        int total=price-dp;
        System.out.println("Total = "+total);

    }
}
