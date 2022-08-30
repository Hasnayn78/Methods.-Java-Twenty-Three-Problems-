package Method;

public class MidPoint {



    public static boolean midPoint(int n1,int n2,int n3){
        boolean midpoint=false;
        int max=Math.max(n1,Math.max(n2,n3));
        int min=Math.min(n1,Math.min(n2,n3));

        int middeI=(min+max)/2;
        int middleII=n1+n2+n3-max-min;
        if (middeI==middleII){
            midpoint=true;
        }

        return midpoint;
    }


    public static void main(String[] args) {
        System.out.println(midPoint(100,40,160));
    }
}
