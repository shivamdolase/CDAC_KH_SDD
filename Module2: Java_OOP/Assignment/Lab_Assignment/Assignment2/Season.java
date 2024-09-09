import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of the month; for eg. Jan=1,Feb=2,March=3,etc :");

        int mt=sc.nextInt();

        switch (mt) {
            case 12:
            case 1:
            case 2:
                System.out.println("Season=Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Season=Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Season=Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Season=Autumn");
                break;    
            default:
                System.out.println("Invalid Month number");
            
                break;
        }
    }
}
