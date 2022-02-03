package loops;

import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter num : ");
        int num= in.nextInt();
        int sum=1;
        for (int i=2;i<num;i++){
            if (num%i==0){
                sum+=i;

            }

        }

        if (sum==num){
            System.out.println("It is a Perfect Number");
        }
        else{
            System.out.println("It is not a Perfect Number");
        }
    }

}
