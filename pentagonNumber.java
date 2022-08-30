package Method;

public class pentagonNumber {


    static int pentagonnumber(int num){
        int pgnum= (num*(3*num-1))/2;

        return pgnum;
    }

    public static void main(String[] args) {
        int count=1;

        System.out.println("\t\t\tTop Fifty Pentagon number are : ");
        for (int i=1; i<=50; i++){
            System.out.print(pentagonnumber(i) +"  ");
            if (count%10==0){
                System.out.println();

            }
                count++;
        }
    }

}
