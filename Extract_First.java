package Method;

public class Extract_First {



  /*


    Input an integer(positive/negative): 1234
    Extract the first digit from the said integer:
    +



  */

    public static int extractFirst(int digit){

        int dividend=10;
        while (digit/dividend!=0 ){


            dividend*=10;

        }


       // 444/100==4.44==4

        return Math.abs(digit/(dividend/10));
    }


    public static void main(String[] args) {

        System.out.print("Index Zero == ");
        System.out.println(extractFirst(-82345));
    }
}
