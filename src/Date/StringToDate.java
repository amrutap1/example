package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import  java.util.Date;

public class StringToDate {

    public static void main(String[] args) throws ParseException {
        int date=01;
        int month=01;
        int year=2015;
        String in=date+ "/"+ month +"/" +year;
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/mm/yyyy");
        Date theDate=dateFormat.parse(in);
        System.out.println("Date parsed = "+ dateFormat.format(theDate));
    }
}
