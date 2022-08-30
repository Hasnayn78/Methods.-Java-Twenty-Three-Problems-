package Method;

import java.util.Scanner;

public class pentagonArea {


    static public double  pentagoArea(double nofs,double len){
        return (nofs*Math.pow(len,2))/(4*Math.tan(Math.PI/nofs));
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n;
        double s;

        System.out.print("Enter number of sides : ");
        n=scanner.nextDouble();

        System.out.print("Enter length of sides : ");
        s=scanner.nextDouble();


        System.out.println("Area of Pentagon is : "+pentagoArea(n,s));
    }

}
