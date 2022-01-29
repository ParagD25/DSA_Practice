package loops;

import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter num : ");
        int num= in.nextInt();

        for (int i=1;i<=num;i++){
            if (num%i==0){

                System.out.println(i);
            }
        }
    }
}
