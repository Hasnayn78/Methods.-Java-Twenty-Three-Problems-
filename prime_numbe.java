package Method;

public class prime_numbe {


    public static boolean checkPrime(int num) {
        boolean prime = true;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                prime = false;
            }


        }

        return
                prime;
    }

    public static void main(String[] args) {
        int num1;
        int num2;

        for (num1 = 2, num2 = num1 + 2; num1 <= 100; num1++, num2++) {
            if (checkPrime(num1) && checkPrime(num2)) {
                System.out.println("("+num1 + " , " + num2+")");
            }
        }
    }
}


