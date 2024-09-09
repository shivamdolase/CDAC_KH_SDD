import java.util.Scanner;

class DiscountCalculator {

    private double price;
    private double discount;
    private double discountAmount;
    private double finalPrice;

    

    public double getDiscountAmount() {
        return discountAmount;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    
    public void setPrice(double Price) {
        this.price = Price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


    public void calculateDiscount() {
        discountAmount = price * (discount / 100);  // Calculate discount amount
        finalPrice = price - discountAmount;            // Calculate final price after discount
    }

}
   
public class Discount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiscountCalculator dc = new DiscountCalculator();


        System.out.println("Enter the original price of the item :");
        dc.setPrice(sc.nextDouble());

        System.out.println("Enter the discount rate :");
        dc.setDiscount(sc.nextDouble());

        dc.calculateDiscount();
        sc.close();
        System.out.printf("Discount Amount: %.2f\n", dc.getDiscountAmount());
        System.out.printf("Final Price: %.2f\n", dc.getFinalPrice());
    
    }
}
