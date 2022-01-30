package loops;

import java.util.Scanner;

public class compund {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Principal amount : ");
        double p=in.nextDouble();
        System.out.print("Enter Rate : ");
        double r=in.nextDouble();
        System.out.print("Enter Time : ");
        double t=in.nextDouble();

        double ci=p*Math.pow((1+(r/100)),r);
        System.out.println("Compund Intrest = "+ci);
    }
}
