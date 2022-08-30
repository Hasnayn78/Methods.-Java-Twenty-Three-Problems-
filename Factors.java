package Method;

public class Factors {


    public static void factor(int number,int divider){
        int factorCunter=0;
        int d= divider;
        int dv=divider;
        while (number/dv>0)
        {
            dv=dv*d;

            factorCunter++;


        }
        for (int i =0;i<factorCunter;i++)
        {

            System.out.print(divider+"*");

        }

        System.out.print("1");

    }



    public static void factorCount(int num,int dv){

        System.out.println(num+" == ");
        int result=num;
        while (result%dv==0){
            System.out.print(dv+"*");

            result=result/dv;
        }
        System.out.print(result);

    }

    public static void test(int n){
        System.out.print(n + " = ");
        int result = n;
        while (result % 3 == 0){
            System.out.print("3 * ");
            result = result / 3;
        }
        System.out.print(result);
    }

    public static void main(String[] args) {
        System.out.print("Method.Method.Factors of ");
       // factor(45,3);
        factorCount(45,3);
        //test(81);

    }


}
