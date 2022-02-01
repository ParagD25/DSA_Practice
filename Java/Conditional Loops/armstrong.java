package loops;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num= in.nextInt();
        int original=num;
        int count=0;
        int ans=0;
        while (original!=0){
            int res=original%10;
            ans+=Math.pow(res,3);
            original=original/10;

        }
        System.out.println("Answer : "+ans);

    }
}
