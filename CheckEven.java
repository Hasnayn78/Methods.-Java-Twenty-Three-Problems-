package Method;

public class CheckEven {




    public static boolean checkEven(int number){

        boolean even=true;

        if (number==0){
            even=false;
        }

        while (number>0){


            int reminder=number%10;
            number=number/10;


            if (reminder%2!=0)
            {
                even=false;
            }



        }

        return even;
    }

    public static void main(String[] args) {
        if (checkEven(444445)){
            System.out.println("Even");
        }
        else
            System.out.println("Not");
        System.out.println(checkEven(44044));
    }
}
