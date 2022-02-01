package loops;

import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1= in.nextInt();
        System.out.print("Enter num2 : ");
        int num2= in.nextInt();
        int i,hcf=0;
        for (i=1;i<=num1||i<=num2;i++){

            if (num1%i==0 && num2%i==0){
                hcf=i;
            }

        }
        System.out.println("HCF = "+hcf);

    }

}
