import java.util.Scanner;

class ClaComp{
    private int principal;
    private double rate;
    private int compNum;
    private int yr;
    private double futureVal;
    private double totalInterest;
    Scanner sc=new Scanner(System.in);
    public void acceptRecords(){
        System.out.print("Enter the initial investment amount : ");
        principal=sc.nextInt();
        
        System.out.print("Enter the annual interest rate (%): ");
        rate=sc.nextDouble();

        System.out.print("Enter the number of times the interest is compounded per year: ");
        yr=sc.nextInt();

        System.out.print("Enter the investment duration (in years): ");
        compNum=sc.nextInt();
        
    }
    public void printRecords(){
        System.out.printf("Future value: %.2f\n",futureVal);
        System.out.printf("Total interest: %.2f\n",totalInterest);
    }

    
    
    void calFutureVal(){
        double currRate=rate/100;
        futureVal=principal*Math.pow((1+currRate/compNum),compNum*yr);
        totalInterest=futureVal-principal;
    }
    


}
public class Compound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ClaComp cc=new ClaComp();
        
        cc.acceptRecords();
        cc.calFutureVal();
        cc.printRecords();

        
        
    }
}