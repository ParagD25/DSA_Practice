package loops;

import java.util.Scanner;

public class npr_and_ncr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n= in.nextInt();
        System.out.print("Enter r : ");
        int r= in.nextInt();
        long pn=1;
        long pr=1;
        long pnr=1;

        for (int a=n;a>0;a--){
            pn*=a;
        }
        for (int b=r;b>0;b--){
            pr*=b;
        }
        for (int c=n-r;c>0;c--){
            pnr*=c;
        }


        long npr=pn/pnr;
        long ncr=pn/(pr*pnr);

        System.out.println("npr = "+npr);
        System.out.println("ncr = "+ncr);


    }
}
