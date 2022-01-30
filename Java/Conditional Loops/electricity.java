package loops;

import java.util.Scanner;

public class electricity {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Units : ");
        int unit=in.nextInt();
        int rate=0;
        if (unit>1 && unit<100){
            rate=10*unit;
        }
        else if (unit>100 && unit<200){
            rate=(10*100)+(15*(unit-100));
        }
        else if (unit>200 && unit<300){
            rate=(100*10)+(100*15)+((unit-200)*20);
        }
        else{
            rate=(100*10)+(100*15)+(100*20)+((unit-300)*25);
        }

        System.out.println("Bill = "+rate);
    }

}
