import java.util.Scanner;

class BMITracker {
    // Fields for weight, height, BMI value, and classification
    private double weight;
    private double height;
    private double bmi;
    private String classification;
    Scanner sc=new Scanner(System.in);

    public void acceptRecord(){
        System.out.println("Enter weight in kilograms:");
        weight=sc.nextDouble();

        System.out.println("Enter height in meters:");
        height=sc.nextDouble();
    }
    public void printRecords(){
        System.out.printf("Your BMI: %.2f\n", bmi);
        System.out.println("BMI Classification: " + classification);
    }
    
  
    // Method to calculate BMI
    public void calculateBMI() {
        bmi = weight / (height * height);
    }

    // Method to classify the BMI
    public void classifyBMI() {
        if (bmi < 18.5) {
            classification = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            classification = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            classification = "Overweight";
        } else {
            classification = "Obese";
        }
    }

    
}

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BMITracker tracker = new BMITracker();
        tracker.acceptRecord();
        tracker.calculateBMI();  
        tracker.classifyBMI();    

        tracker.printRecords();
        
    }
}