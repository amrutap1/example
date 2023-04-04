package Date;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.Scanner;
//
//public class EmpDate {
//    public static void main(String[] args) throws ParseException {
//        Calendar c= Calendar.getInstance();
//        Date d= new Date();
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Joining Date (dd/mm/yyyy): ");
//        int date=sc.nextInt();
//        int month=sc.nextInt();
//        int year=sc.nextInt();
//        System.out.println("Enter  Date (dd/mm/yyyy): ");
//        int date1=sc.nextInt();
//        int month1=sc.nextInt();
//        int year1=sc.nextInt();
//        String in=date+ "/"+ month +"/" +year;
//        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/mm/yyyy");
//        Date theDate=dateFormat.parse(in);
//        System.out.println(in);
//        String in1=date1+ "/"+ month1 +"/" +year1;
//        SimpleDateFormat dateFormat1=new SimpleDateFormat("dd/mm/yyyy");
//        Date theDate1=dateFormat1.parse(in1);
//        System.out.println(in1);
//
//       }
//}
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

public class EmpDate {
    public static void main(String[] args) throws ParseException{
        LocalDate current = LocalDate.now();
        LocalDate dj = LocalDate.of(2019,10,4);
        int exp = Period.between(dj,current).getYears();
        System.out.println("Experience: "+exp +"Years");
    }
}