import java.io.Serializable;

public class Employee implements Serializable {

    long empId;
    String empName;
    transient long empSalary;
    Employee(Long empId,String empName,long empSalary){
        this.empId=empId;
        this.empName=empName;
        this.empSalary=empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}
