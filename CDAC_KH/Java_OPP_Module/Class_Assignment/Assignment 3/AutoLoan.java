import java.util.Scanner;

class Loanculator{
    private int pr_amount;
    private double rate;
    private int yr;
    private double monthlyPay;
    private double totalPay;
    Scanner sc=new Scanner(System.in);
    void acceptRecord(){
        System.out.println("enter principal amount");
        this.pr_amount=sc.nextInt();
        System.out.println("Enter interesgt rate");
        this.rate=sc.nextDouble();
        System.out.println("Enter years");
        this.yr=sc.nextInt();
    }

    public void calmonthlyPay(){
        int numMonths=yr*12;
        double mRate=rate/12/100;

        monthlyPay = pr_amount * (mRate * Math.pow(1 + mRate, numMonths)) /
        (Math.pow(1 + mRate, numMonths) - 1);

        totalPay=monthlyPay*numMonths;
    }
    
    public void printRecords(){
        System.out.printf("Montlypay: %.2f",monthlyPay);
        System.out.printf("\nTotalpay: %.2f",totalPay);
    }


    


}
public class AutoLoan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Loanculator lc=new Loanculator();
        System.out.println("enter loan details:");
        
        lc.acceptRecord();

        lc.calmonthlyPay();
        lc.printRecords();
        }
}
