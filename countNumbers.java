package Method;

public class countNumbers {





    public static int count_number(int i,int digit){

        int key=i;
        int dg=digit;
        int nC=0;
        do{

            if(digit%10==key) {

                nC++;
            }
                digit=digit/10;


        }while (digit>0);

return nC;

    }




    public static void main(String[] args) {
        System.out.println(count_number(3,24353));
    }
}
