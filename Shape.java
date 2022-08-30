package Method;

public class Shape {




    public static void shape(){
        int n;
        for(n=1;n<=10;n++){
            for(int i = 0;i<n;i++){
                System.out.print(n);
                System.out.print(i);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        shape();
    }


}
