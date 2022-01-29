package loops;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int radius=in.nextInt();
        int base=in.nextInt();
        int height=in.nextInt();
        String shape= in.next();
        double area=0;

        switch (shape){
            case "circle":
                area=(22/7)*radius*radius;
                System.out.println(area);
                break;
            case "triangle":
                area=(1/2)*base*height;
                System.out.println(area);
                break;
            case "rectangle":
                area=base*height;
                System.out.println(area);
                break;
            case "isoseles":
                area=(1/2)*base*height;
                System.out.println(area);
                break;
            case "parallelogram":
                area=base*height;
                System.out.println(area);
                break;
            case "rombus":
                area=(1/2)*base*height;
                System.out.println(area);
                break;
            case "equilateral":
                area=(Math.pow(3,0.5)/4)*(base*base);
                System.out.println(area);
                break;
            default:
                System.out.println("No such Shape");

        }
    }
}
