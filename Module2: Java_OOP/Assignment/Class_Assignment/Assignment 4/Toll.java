
import java.util.*;


class TollBoothRevenueManager{
    private int motarToll;
    private int carToll;
    private int truckToll;
    private int motarCount;
    private int carCount;
    private int truckCount;

    private int totalRev;
    private int tcount;

    //constructor
    TollBoothRevenueManager(){
        this(0,0,0);
    }
    TollBoothRevenueManager(int motarToll,int carToll,int truckToll){
        this.motarToll=motarToll;
        this.carToll=carToll;
        this.truckToll=truckToll;
    }


    //setter
    void setMotorToll(int motarToll){
        this.motarToll=motarToll;
    }
    void setCarToll(int carToll){
        this.carToll=carToll;
    }
    void setTruckToll(int truckToll){
        this.truckToll=truckToll;
    }
    void setMotorCount(int motarCount){
        this.motarCount=motarCount;
    }
    void setCarCount(int carCount){
        this.carCount=carCount;
    }
    void setTruckCount(int truckCount){
        this.truckCount=truckCount;
    }

    //getter
    int getMotorToll (){
        return motarToll;
    }
    int getCarToll(){
        return carToll;
    }
    int getTruckToll(){
        return truckToll;
    }
    int getMotorCount (){
        return motarCount;
    }
    int getCarCount(){
        return carCount;
    }
    int getTruckCount(){
        return truckCount;
    }

    int getTotalRev(){
        return totalRev;
    }

    int getTotalCOunt(){
        return tcount;
    }
    

    //instance methods
    public void calTotal(){
        totalRev=(carCount*carToll)+(motarCount*motarToll)+(truckCount*truckToll);
        
    }

    public void totalVehicleCount(){
        tcount=motarCount+carCount+truckCount;
        
    }

    //toString
    public String toString() {
        return "TollBoothRevenueManager{" +
                "Motorcycle Rate= " + motarToll +
                ", Car Rate= " + carToll +
                ", Truck Rate= " + truckToll +
                ", Motorcycles Passed=" + motarCount +
                ", Cars Passed=" + carCount +
                ", Trucks Passed=" + truckCount +
                "}";
    }


}
class TollBoothRevenueManagerUtil{
    Scanner sc=new Scanner(System.in);
    TollBoothRevenueManager tollB=new TollBoothRevenueManager();
    public void acceptRecord(){
        
        System.out.println("Enter ");
        System.out.println("Toll for Motorcycle :");
        tollB.setMotorToll(sc.nextInt());

        System.out.println("Toll for Car :");
        tollB.setCarToll(sc.nextInt());

        System.out.println("Toll for Truck :");
        tollB.setTruckToll(sc.nextInt());

        System.out.println("Enter the number of Motorcycles that passed:");
        tollB.setMotorCount(sc.nextInt());

        System.out.println("Enter the number of Cars that passed:");
        tollB.setCarCount(sc.nextInt());

        System.out.println("Enter the number of Trucks that passed:");
        tollB.setTruckCount(sc.nextInt());
    }

    public void printRecords(){
        System.out.println(tollB.toString());;

        tollB.calTotal();
        tollB.totalVehicleCount();
        System.out.println("Total revenue :"+tollB.getTotalRev());
        System.out.println("Total Count of vehicle:"+tollB.getTotalCOunt());
    }
    


    void menuList(){
        System.out.println("Menu:");
        System.out.println("0.Exit...");
        System.out.println("1.acceptRecord");
        System.out.println("2.prnitRecord:");
    }
}
public class Toll{
    public static void main(String[] args) {

        TollBoothRevenueManagerUtil tutil=new TollBoothRevenueManagerUtil();
        
        tutil.acceptRecord();
        tutil.printRecords();
        Scanner sc=new Scanner(System.in);
        int choice=2;
        while(choice!=0){
            tutil.menuList();
            System.out.println("Enter your choice:");
            choice=sc.nextInt();

            switch (choice) {
                case 1:
                    tutil.acceptRecord();
                    break;
                case 2:
                    tutil.printRecords();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        
    
    }
}
