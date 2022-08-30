package Method;

public class SumInteger {




    static int sumInteger3(int integer){


        int number = integer;
        int sum=0;
        while(number>0){

            sum= sum + number%10 ;
            number  =  number/10;


        }



        return sum;

    }
    public static void main(String[] args) {
        System.out.print("Sum of digits of given value is : ");
        System.out.println(sumInteger3(1234));

    }
}
