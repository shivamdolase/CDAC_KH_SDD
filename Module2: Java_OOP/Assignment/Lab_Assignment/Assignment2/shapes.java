import java.util.Scanner;
import java.lang.Math;
public class shapes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Select a shape you desier:");

        System.out.println("Enter following intergers for respective shapes:");
        System.out.print("1-Circle, ");
        System.out.print("2-Square, ");
        System.out.print("3-Rectangle");
        System.out.print("4-Triangle");
        int n=sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("Enter the radius of the circle");
                int r=sc.nextInt();
                double area_c=(Math.PI*r*r);
                System.out.printf("%s%.3f","Area of the Circle id: ", area_c);
                break;
            case 2:
                System.out.println("Enter the side lenght of the Square");
                int s=sc.nextInt();
                int area_sq=(s*s);
                System.out.println("Area of Square is: "+area_sq);
                break;
            case 3:
                System.out.println("Enter the length and breath of the rectangle");
                int l=sc.nextInt();
                int b=sc.nextInt();
                int area_r=(l*b);
                System.out.println("Area of the rectangle is:" + area_r);
                break;
            case 4:
                System.out.println("Enter the height and base length of the triangle");
                int h=sc.nextInt();
                int bs=sc.nextInt();
                int area_t=(bs*h)/2;
                System.out.println("Area of the Triangle is: "+area_t);
                break;
                
                
        
            default:
                System.out.println("Enter another number.");
                break;
        }



    }
    
}
