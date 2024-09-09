import java.util.Scanner;

class DiscountCalculator {

    private double price;
    private double discount;
    private double discountAmount;
    private double finalPrice;

    Scanner sc = new Scanner(System.in);
    public void acceptRecords(){
        System.out.println("Enter the original price of the item :");
        this.price=sc.nextDouble();

        System.out.println("Enter the discount rate :");
        this.discount=sc.nextDouble();

    }
    public void printRecords(){
        System.out.printf("Discount Amount: %.2f\n", discountAmount );
        System.out.printf("Final Price: %.2f\n", finalPrice);
    }


    public void calculateDiscount() {
        discountAmount = price * (discount / 100);  // Calculate discount amount
        finalPrice = price - discountAmount;            // Calculate final price after discount
    }

}
   
public class Discount{
    public static void main(String[] args) {
        
        DiscountCalculator dc = new DiscountCalculator();


        dc.acceptRecords();
        dc.calculateDiscount();
        dc.printRecords();
    
    }
}