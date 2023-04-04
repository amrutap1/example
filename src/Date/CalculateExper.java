package Date;

import java.util.Calendar;
import java.util.Date;

public class CalculateExper {
    public static void main(String[] args) {
        int days = 14;
        Calendar cal = Calendar.getInstance();
        Date d = cal.getTime();
        cal.add(Calendar.DAY_OF_YEAR, days);
        Date d1 = cal.getTime();
        System.out.println("Current Date : " + d);
        System.out.println("Day After Two Weeks : " + d1);
    }
}
