package Method;

public class printAllCharacter {



    static void pAc(char ch1,char ch2,int n){

        for(int i=1   ;ch1<=ch2;i++, ch1++){

            System.out.print(ch1+" ");
            if (i%n==0){
                System.out.println();
            }
        }


    }

    public static void main(String[] args) {
        pAc('(','z',20);
    }
}
