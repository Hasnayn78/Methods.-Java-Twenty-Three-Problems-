package Method;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int num;

        char y = 'A';
        int x = y;
        System.out.println(x);
        System.out.print("Enter any number : ");
        num = scanner.nextInt();

        System.out.println("Entered number is : "+num);


    }
}