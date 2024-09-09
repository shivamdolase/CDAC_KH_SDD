import java.util.Scanner;

class Loanculator{
    private int pr_amount;
    private double rate;
    private int yr;
    private double monthlyPay;
    private double totalPay;
    public int getamount() {
        return pr_amount;
    }
    public double getRate() {
        return rate;
    }
    public int getYear() {
        return yr;
    }
    public double getmonthlyPay(){
        return monthlyPay;
    }
    public double getTotalPay(){
        return totalPay;
    }
    public void setAmount(int amount){
        this.pr_amount=amount;
    }
    public void setRate(double rate){
        this.rate=rate;
    }
    public void setYear(int yr){
        this.yr=yr;
    }

    void calmonthlyPay(){
        int numMonths=yr*12;
        double mRate=rate/12/100;

        monthlyPay = pr_amount * (mRate * Math.pow(1 + mRate, numMonths)) /
        (Math.pow(1 + mRate, numMonths) - 1);

        totalPay=monthlyPay*pr_amount;
    }
    
    


    // void setRecord(int pr_amount,double rate,int yr){
    //     this.pr_amount=pr_amount;
    //     this.rate=rate;
    //     this.yr=yr;
    // }


}
public class AutoLoan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Loanculator lc=new Loanculator();
        System.out.println("enter loan details:");
        System.out.println("Principal Amount:");
        lc.setAmount(sc.nextInt());
        lc.setRate(sc.nextDouble());
        lc.setYear(sc.nextInt());


        lc.calmonthlyPay();
        System.out.printf("Monthly payment: %.2f\n", lc.getmonthlyPay());
        System.out.printf("Total payment: %.2f\n", lc.getTotalPay());
        }
}
