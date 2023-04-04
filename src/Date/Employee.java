package Date;
import java.time.LocalDate;
import java.time.Period;

public class Employee {
    public static void main(String[] args) {
    EmployeeDetails e[]={(new EmployeeDetails(101,"amruta","developer", LocalDate.of(2016,3,02))),
            (new EmployeeDetails(102,"Deven","testing", LocalDate.of(2017,5,23))),
            (new EmployeeDetails(103,"nishad","Developer", LocalDate.of(2012,8,12))),
            (new EmployeeDetails(104,"poonam","testing", LocalDate.of(2015,9,7))),
            (new EmployeeDetails(105,"dhanu","Developer", LocalDate.of(2018,1,1))),};



            for (int i=0;i< e.length;i++){
                LocalDate current = LocalDate.now();
                LocalDate dj = e[i].doj;
                int exp = Period.between(dj,current).getYears();
                System.out.println(e[i]+ "\n"+ exp +"Years");
            }
    }
}
