import java.util.Scanner;

class ClaComp{
    private int principal;
    private double rate;
    private int compNum;
    private int yr;
    private double futureVal;
    private double totalInterest;


    public void setPrincipal(int principal){
        this.principal=principal;
    }
    public void setInterest(double rate){
        this.rate=rate;
    }
    public void setNumberOfCompounds(int compNum){
        this.compNum=compNum;
    }
    public void setYears(int yr){
        this.yr=yr;
    }
    void calFutureVal(){
        double currRate=rate/100;
        futureVal=principal*Math.pow((1+currRate/compNum),compNum*yr);
        totalInterest=futureVal-principal;
    }
    public double getfutureValue(){
        return futureVal; 
    }
    public double getTotalInterest(){
        return totalInterest;
    }


}
public class Compound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ClaComp cc=new ClaComp();
        System.out.print("Enter the initial investment amount (₹): ");
        cc.setPrincipal(sc.nextInt());
        
        System.out.print("Enter the annual interest rate (%): ");
        cc.setInterest(sc.nextDouble());
        System.out.print("Enter the number of times the interest is compounded per year: ");
        cc.setNumberOfCompounds(sc.nextInt());
        System.out.print("Enter the investment duration (in years): ");
        cc.setYears(sc.nextInt());
        cc.calFutureVal();
        

        System.out.printf("Future value: %.2f\n",cc.getfutureValue());
        System.out.printf("Total interest: %.2f\n",cc.getTotalInterest());
        
    }
}
