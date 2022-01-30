package loops;

import java.util.Scanner;

public class depreciation {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter Amount : ");
        int amount= in.nextInt();
        System.out.print("Enter Depriciation : ");
        int dep= in.nextInt();
        System.out.print("Enter Time : ");
        int time= in.nextInt();

        int temp=amount;
        for(int i=0;i<time;i++){
            temp=((100-dep)*temp)/100;
        }
        System.out.println("Total : "+temp);
    }
}
