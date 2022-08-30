package Method;

public class A{

    private int num1;
    private  int num2;
    public void setter(int n1, int n2){

        this.num1=n1;
        this.num2=n2;
    }

    public int getter(){
        int add = num1+num2;
        return add;


    }




    public static void main(String[] args) {
       A a = new A();
       a.setter(6,6);
        System.out.println( a.getter());
    }
}
