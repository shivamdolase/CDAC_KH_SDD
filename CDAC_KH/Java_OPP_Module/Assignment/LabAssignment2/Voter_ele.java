import java.util.Scanner;
public class Voter_ele {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your age:");
        int age=sc.nextInt();
        
        if( age< 18){
            System.out.println("Your not eligible to vote.");
        }
        else
            System.out.println("your eligible to vote");

        
    }   
}
