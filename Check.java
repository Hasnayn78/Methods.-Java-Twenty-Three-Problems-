package Method;

import java.util.Scanner;


public class Check {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);


        String string = new String();
        System.out.print("Write Something : ");
        string=scanner.nextLine();


        int vowels=0;
        int consonents=0;
        int spaces=0;
        int words=1;

        for(int i = 0;i<string.length();i++){
            if (string.charAt(i)=='a'||string.charAt(i)=='o'||string.charAt(i)=='e'||string.charAt(i)=='i'||string.charAt(i)=='u'||string.charAt(i)=='A'||string.charAt(i)=='E'||string.charAt(i)=='I'||string.charAt(i)=='U'||string.charAt(i)=='O'){
                vowels++;

            }else if ((string.charAt(i)==' ')){
                words++;

            }else

                consonents++;



        }
        System.out.println("Number of Vowels in above Line is : "+vowels);
        System.out.println("Number of Consonants in above Line is : "+consonents);
        System.out.println("Number of Words above Line is : "+words);





    }
}
