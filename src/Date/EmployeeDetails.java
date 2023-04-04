package Date;

import java.time.LocalDate;

public class EmployeeDetails {
    int empid;
    String ename;
    String dept;
    LocalDate doj;

    EmployeeDetails(int id, String ename, String dept, LocalDate doj){
        this.empid=id;
        this.ename=ename;
        this.dept=dept;
        this.doj=doj;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }


    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }




    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "empid=" + empid +
                ", ename='" + ename + '\'' +
                ", dept='" + dept + '\'' +
                ", doj=" + doj +
                '}';
    }



}
