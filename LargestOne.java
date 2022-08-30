package Method;

import java.util.Scanner;

public class LargestOne {

    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);


        int numA;
        int numB;
        int numC;
        System.out.print("Enter Number Method.A : ");
        numA=scanner.nextInt();
        System.out.print("Enter Number B : ");
        numB=scanner.nextInt();
        System.out.print("Enter Number C : ");
        numC=scanner.nextInt();

        if (numA>numB&&numA>numC){
            System.out.println("Greater Number is "+numA);
        }else if (numB>numC&&numB>numA){
            System.out.println("Greater Number is : "+numB);
        }
        else System.out.println("Greater Number is : "+numC);



        if (numA<numB&&numA<numC){
            System.out.println("Smaller Number is "+numA);
        }else if (numB<numC&&numB<numA){
            System.out.println("Smaller Number is : "+numB);
        }
        else System.out.println("Smaller Number is : "+numC);

        System.out.println();
    }

}
