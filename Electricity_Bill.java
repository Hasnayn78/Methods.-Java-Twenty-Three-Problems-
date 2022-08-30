package Method;

import java.util.Scanner;

public class Electricity_Bill {
 public  static Scanner scanner=new Scanner(System.in);


    public static void main(String[] args) {


        byte unitPrice;
        System.out.print("Enter number of unit used : ");
        int unitUsed = scanner.nextInt() ;

        int totalBill;

        if(unitUsed>300){
            unitPrice=40;
        }else
            unitPrice=20;


        totalBill=unitPrice*unitUsed;

        System.out.print("Your Bill is : ");
        System.out.print(totalBill);
        System.out.println(" pkr");

    }


}
