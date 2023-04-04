package Date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String args[]){
        Date d=new Date();
        System.out.println("Today's date is: "+d);
        String s;
        Format formatter;
        formatter = new SimpleDateFormat("G EEE yyyy/ME/dd HH:mm:ss");
        s=formatter.format(d);
        System.out.println(s);
        formatter = new SimpleDateFormat("hh:mm:ss yyyy/MM/dd");
        s=formatter.format(d);
        System.out.println(s);
        formatter = new SimpleDateFormat ("hh:mm:ss yyyy/MM/dd EEE");
        s=formatter.format(d);
        System.out.println(s);
        formatter = new SimpleDateFormat ("EEEE, dd MMMM YYYY HH:mm:ss");
        s=formatter.format(d);
        System.out.println(s);
        formatter = new SimpleDateFormat ("E, dd MMM YYYY HH:mm:ss Z");
        s=formatter.format(d);
        System.out.println(s);
    }
}
