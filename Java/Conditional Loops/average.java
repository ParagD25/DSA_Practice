package loops;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res=0;
        int count=0;
        int average=0;
        while (true) {
            System.out.print("Enter number : ");
            int num=in.nextInt();
            if (num==0){
                break;
            }
            else {
                count += 1;
                res += num;
                average = res / count;
            }


        }
        System.out.println("Average : "+average);

    }
}
