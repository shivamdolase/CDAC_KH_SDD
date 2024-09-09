import java.util.Scanner;
import java.lang.Math;
public class BMI {
    public static void main(String[] args) {
        Scanner milkpot=new Scanner(System.in);

        System.out.println("Let's claculate your BMI");
        System.out.println("Enter your weight here in kg:");
        float wt=milkpot.nextInt();
        System.out.println("Enter your height here in cm:");
        float ht=milkpot.nextInt();

        float  bmi=(wt*10000)/(ht*ht);
        System.out.println("Your bmi is "+bmi+ ".");

        if(bmi <17){
            System.out.println("You are under weight.");
        }
        else if(bmi>25){
            System.out.println("You are over weight");
        }
        else{
            System.out.println("You weight is normal");
        }
    }
    
}
