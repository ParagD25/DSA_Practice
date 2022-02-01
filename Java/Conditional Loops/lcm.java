package loops;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1= in.nextInt();
        System.out.print("Enter num2 : ");
        int num2= in.nextInt();
        int i,lcm,hcf=0;
        for (i=1;i<=num1||i<=num2;i++){
            if (num1%i==0 && num2%i==0){
            hcf=i;
        }
        }

        lcm=(num1*num2)/hcf;
        System.out.println("LCM = "+lcm);
    }
}
