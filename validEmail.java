package Method;

import java.util.Scanner;

public class validEmail {

    public static  boolean isValid(String email){


        boolean contain=false;
        boolean hasNum=false;
        boolean haslCase=false;
        for (int i=0;i<email.length();i++) {
           if (email.contains("@" )&&email.contains(".com")) {

              contain = true;

           }
        if (Character.isDigit(email.charAt(i))) {

                hasNum = true;

            } else if (Character.isLowerCase(email.charAt(i))) {

                haslCase = true;

            }

        }
            if (contain && haslCase && hasNum) {
return true;
            }else return false;



    }

    public static void main(String[] args)
    {


       Scanner  scanner =new Scanner(System.in);
        System.out.print("Enter email : ");
       String email=scanner.nextLine();
       if(isValid(email)){
           System.out.println("Entered email is Valid ");
       }
       else
           System.out.println("Entered Email is not Valid");


    }
}




