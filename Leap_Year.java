package Method;

public class Leap_Year {

public static void leapYear(){

    int year =2040;
    boolean clCheck;

    if (year%4==0){

        if(year%100==0){


            if (year%400==0){

                clCheck=true;
            }

            clCheck=false;
        }else
            clCheck=true;

    }else
        clCheck=false;

    System.out.println(clCheck);



}
    public static void main(String[] args) {
       // int year = 2220;

        leapYear();

    }
}