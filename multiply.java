package Method;

import java.util.Scanner;

public class multiply {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);


        float num1 ;
        float num2 ;

        System.out.println("Enter any number : ");
        num1=scanner.nextFloat();


        System.out.println("Enter any number : ");
        num2=scanner.nextFloat();



        float multiply = num1*num2;
        float oqutiont = num1/num2;
        float remider = num1%num2;

        System.out.println("Multiplication of given numbers is : "+multiply);
        System.out.println("Quuotiont  is : "+oqutiont);
        System.out.println("Remider is : "+remider);


    }
}
