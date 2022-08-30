package Method;

import java.math.*;

public class Roots {

    public static void main(String[] args) {
        double a=0;
        double b=0;
        double c=4.3;
        double root1;
        double root2;


        double determinent = b*b-4*a*c;

        if(determinent>0) {
            root1 = -b + Math.sqrt(determinent) / 2 * a;
            root2 = -b - Math.sqrt(determinent) / 2 * a;


            System.out.println("root Method.A : "+root1);
            System.out.println("root B : "+root2);

        }else if(determinent==0){


            root1=root2=-b/2*a;


            System.out.println("root Method.A : "+root1);
            System.out.println("root B : "+root2);



        }else
            System.out.println("roots are complex");



    }


}
