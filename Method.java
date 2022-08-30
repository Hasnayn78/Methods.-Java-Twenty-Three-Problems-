package Method;

public class Method {



    public void  printName(){
        System.out.println("I am Hasnayn");
    }
    public void printAge()  {
        System.out.println("19");
    }

    public void shape(){
        for(int i =0;i<=10;i++){

            System.out.print  ("+");
        }

    }



   // small number

    static void min(int n1,int n2, int n3){

        if(n1<n2&&n1<n3){
            System.out.println(n1+" is small");
        }else if(n2<n1&&n2<n3){
            System.out.println(n2+" is small");
        }else System.out.println(n3+" is small");

    }




    // Average
        static int averAge(int n, int m, int o){
                int avr=(n+m+o)/3;
             System.out.println("Average is : ");
                    return avr;
    }





    // Middle Character


    static void middleCHAR(){

            String word="School";

            int length = word.length()-1;
        System.out.println(length);

            int middle=(0+length)/2;
        char middleCHR;
        System.out.println( );
if (length%2==0) {
    middleCHR = word.charAt(middle);
    System.out.println(middleCHR);
}else if (length%2==1) {
    middleCHR = word.charAt(middle);
    char middleCHR2 = word.charAt(middle + 1);

    System.out.print(middleCHR+""+middleCHR2);
}else
    System.out.println("(';')");

    }




    // count  Words

    static void countWords(){

        int wCount;


        String line = "kh khh i";

        int wlength = line.length();
        if (wlength>1){
            wCount=1;
        }else
            wCount=0;
        for(int i=0;i<line.length();i++) {

            if (line.charAt(i) == ' ') {

                ;//.
                wCount++;

            }
        }
            System.out.print("Words in entered line is : "+wCount);


    }

    public static void main(String[] args) {
        Method method = new Method();
            // method.printName();
        //method.printAge();
            //method.shape();

     //   min(12,23,11);

    //    System.out.print( averAge(1,2,3));

     //    middleCHAR();

      //    countWords();




    }
}
