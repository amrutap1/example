package Date;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateDemo2 {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println("Today's date is: "+d);
        DateFormat df;
        df=DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
        System.out.println("United Kingdom: " + df.format (d));

        df=DateFormat.getDateInstance(DateFormat. FULL, Locale.UK);
        System.out.println("United Kingdom: " + df.format (d));

        df =DateFormat.getDateInstance(DateFormat.SHORT, Locale. UK);

        System.out.println("United Kingdom: "+df.format (d));

        df = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);

        System.out.println("United States: " + df.format (d));

        df=DateFormat.getDateInstance(DateFormat.FULL, Locale.US);

        System.out.println("United States: " + df. format (d));

        df=DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
        System.out.println("United States: " + df. format (d));
    }
}
