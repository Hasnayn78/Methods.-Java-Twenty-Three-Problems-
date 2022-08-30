package Method;

import java.util.Date;

public class DateTime {


    public static Date cDate(Date cd){
        Date currentCdate = new Date();
        currentCdate=cd;
        final Date currentCdate1 = currentCdate;
        return currentCdate1;

    }


    public static void main(String[] args) {
        Date current = new Date();
     //   System.out.println(cDate(current));

        System.out.println(current);
    }
}
