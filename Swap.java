package Method;

public class Swap {


    public static void main(String[] args) {
        int numA=12;
        int numB=14;
        int temp;
        System.out.println("Before swapping");

        System.out.println(numA);
        System.out.println(numB);

        temp = numA;
        numA=numB;
        numB=temp;

        System.out.println("After Swapping ");

        System.out.println(numA);
        System.out.println(numB);

    }
}
