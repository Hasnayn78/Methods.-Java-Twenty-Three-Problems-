package Method;

import java.util.Scanner;
public class validPassword

            {


                // Method.Method to check whether entered password is fulfilling requirements.

                public static boolean isValid(String pass) {
                    boolean hasNum = false;
                    boolean hasUCases = false;
                    boolean hasLCase = false;
                    char chr;
                    int num_Count=0;
                    int l_Count=0;
                    int U_Count=0;

                    for (int i = 0; i < pass.length(); i++) {
                        chr = pass.charAt(i);
                        if (Character.isUpperCase(chr)) {
                            hasUCases = true;
                            U_Count++;
                        } else if (Character.isDigit(chr)) {

                            hasNum = true;
                            num_Count++;
                        } else if (Character.isLowerCase(chr)) {

                            hasLCase = true;
                            l_Count++;
                        }
                        if (hasLCase == true && hasNum == true && hasUCases == true) {

                            // Number of digits,UCase and LCase lettres must be greater than two.
                            if (num_Count >= 2&&l_Count>=2&&U_Count>=2){
                                return true;
                            }
                        }
                    }


                    return false;

                }


                public static boolean isNumeric(String ps){
                    for (int i = 0;i<ps.length();i++){


                        if(ps.charAt(i)>='0'&&ps.charAt(i)<='9'){
                            return true;
                        }

                    }

                    return true;

                }
                public static boolean isAlphabetic(String s){
                    for (int i = 0;i<s.length();i++){

                        if(s.charAt(i)>='A'&&s.charAt(i)<='z'){
                            return true;
                        }

                    }
                    return true;
                }


                // Method.A method to check length o password.
                public static void valPass() {

                    Scanner scanner = new Scanner(System.in);

                    System.out.print("Enter Password : ");
                    String psw = scanner.nextLine();


                    if (psw.length() > 7) {
                        if (isAlphabetic(psw) && isNumeric(psw)) {


                            if (isValid(psw)) {

                                System.out.println("Valid Password");

                            }

                        }
                        else

                            System.out.println("Not Valid Password");
                    }
                    else

                        System.out.println("Not Valid Password");


                }

                // Method.Method.Main Method.Method

                public static void main(String[] args) {

                        do {

                                     valPass();

                                                        }
                                                            while (true);

                }

}
