import java.util.Scanner;
class Leap_if{
    void leapyr(int year){
        if(year%400==0 || (year%4==0 && year%100!=0)){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }
}
class Leap_switch{
    void leapyr2(int year){
        int val=year%400==0 || (year%4==0 && year%100!=0)?1:0;
        switch(val){
            case 1:
            System.out.println(year +  " is a leap year.");
            break;
            case 0:
            System.out.println(year + " is not a leap year.");
            break;
            
        }
    }
}

public class Leapyear{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the year:");

        int year=sc.nextInt();
        Leap_if  lp1= new Leap_if();
        Leap_switch lp2=new Leap_switch();


        System.out.println("using if statement");
        lp1.leapyr(year);

        System.out.println("using switch statement");
        lp2.leapyr2(year);

        

    }
}