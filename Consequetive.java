package Method;

public class Consequetive {

//Method.Method I
    public static boolean cstv(int num1 ,int num2 ,int num3)
    {
        boolean n1=false;
        boolean n2=false;
        boolean n3=false;
        boolean tr=false;
        if (num1+1==num2){
            n1=true;
        }if (num2+1==num3){
            n2=true;
        } if(num3-2==num1){
            n3=true;
        }
         if (n1 && n2 && n3){
             tr=true;
         }
        return tr;
    }


    //Method.Method II

    public static boolean checkII(int n,int m,int o){
        int max=Math.max(n,Math.max(m,o));
        int min=Math.min(n,Math.min(m,o));

        int middle=m+n+o-max-min;
        return (max-middle==1&&middle-min==1);
    }


    public static void main(String[] args) {
     //   System.out.println(cstv(45,46,47));
        System.out.println(checkII(13,2,11));
    }

}
