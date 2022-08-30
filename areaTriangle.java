package Method;

public class areaTriangle {

public static boolean checkValid(double a,double b,double c){
    return a + b > c && b + c > a && c + a > b;


}
    public static void printArea(double A,double B, double C) {
        System.out.println("Length of side Method.A : " + A);
        System.out.println("Length of side B : " + B);
        System.out.println("Length of side C : " + C);

        double area;


        double s = (A + B + C) / 2;
        area =  Math.sqrt(s * ((s - A )* (s - B) * (s - C)));
        System.out.print("Area is  : "+area);


    }


     public static void main(String[] args) {
         double a = 10, b = 15, c = 20;

         if (checkValid(a, b, c)) {


             printArea(a, b, c);


         }
         else System.out.println("Area not Valid");
     }



}
