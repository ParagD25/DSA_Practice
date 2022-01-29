package loops;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter numbers : ");
        int res=0;
        while (true){
            int num= in.nextInt();
            res+=num;

            if (num==0){
                break;
            }

        }
        System.out.println("SUM = "+res);


    }

}
