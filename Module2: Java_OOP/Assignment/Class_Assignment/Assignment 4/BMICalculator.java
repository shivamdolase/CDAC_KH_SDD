import java.util.Scanner;

class BMITracker {
    // Fields for weight, height, BMI value, and classification
    private double weight;
    private double height;
    private double bmi;
    private String classification;

    public double getBMI() {
        return bmi;
    }

    public String getClassification() {
        return classification;
    }

    // Setters
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
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

        System.out.println("Enter weight in kilograms:");
        tracker.setWeight(sc.nextDouble());

        System.out.println("Enter height in meters:");
        tracker.setHeight(sc.nextDouble());

        tracker.calculateBMI();  
        tracker.classifyBMI();    

        
        System.out.printf("Your BMI: %.2f\n", tracker.getBMI());
        System.out.println("BMI Classification: " + tracker.getClassification());
    }
}
