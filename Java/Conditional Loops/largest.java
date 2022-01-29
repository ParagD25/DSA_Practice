package loops;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter numbers : ");
        int largest=0;
        while (true){
            int num= in.nextInt();
            if (num>largest){
                largest=num;
            }


            if (num==0){
                break;
            }

        }
        System.out.println("LARGEST = "+largest);


    }
}
