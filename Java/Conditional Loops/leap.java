package loops;

import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Year : ");
        int year= in.nextInt();

        if (year%4==0){
            if (year%100==0) {
                if (year % 400 == 0) {
                    System.out.println("Its a Leap Year");
                }
                else{
                    System.out.println("It is not a Leap year");
                }
            }
            else{
                System.out.println("Its a Leap Year");
            }
        }
        else{
            System.out.println("It is not a Leap year");
        }
    }
}
