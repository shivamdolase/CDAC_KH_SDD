import java.util.Scanner;

class TollBoothRevenueManager{
    private int motarToll;
    private int carToll;
    private int truckToll;
    private int motarCount;
    private int carCount;
    private int truckCount;

    private double totalrev;
    public int tcount;

    Scanner sc=new Scanner(System.in);
    public void acceptRecords(){
      System.out.println("Enter ");
      System.out.println("Toll for Motorcycle :");
      motarToll=sc.nextInt();

      System.out.println("Toll for Car :");
      carToll=sc.nextInt();

      System.out.println("Toll for Truck :");
      truckToll=sc.nextInt();

      System.out.println("Enter the number of Motorcycles that passed:");
      motarCount=sc.nextInt();

      System.out.println("Enter the number of Cars that passed:");
      carCount=sc.nextInt();

      System.out.println("Enter the number of Trucks that passed:");
      truckCount=sc.nextInt();
    }

    public void printRecords(){
        System.out.println("Toyal Revenue: "+totalrev);
        System.out.println("Total vehicle Count: "+tcount);

    }

    public void calculateRevenue(){
        totalrev=(carCount*carToll)+(motarCount*motarToll)+(truckCount*truckToll);
        
    }

    public void totalVehicleCount(){
        tcount=motarCount+carCount+truckCount;
        
    }
    //acceptRecord; 
    //setTollRates, 
    //calculateRevenue  
    //printRecord 
}

public class Tool {
    public static void main(String[] args) {

        TollBoothRevenueManager toll=new TollBoothRevenueManager();

        toll.acceptRecords();
        toll.calculateRevenue();
        toll.totalVehicleCount();
        toll.printRecords();
        
    }
}
