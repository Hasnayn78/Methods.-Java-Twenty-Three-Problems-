package Method;

public class NbyN_Matrix {
static void printMtrix(int order){


    for(int i=1;i<=order;i++){
        for (int j=1;j<=order;j++){
            System.out.print((int)(Math.random()*8)+" ");
        }
        System.out.println();
    }


}
    public static void main(String[] args) {

    printMtrix(11);
    }
}
