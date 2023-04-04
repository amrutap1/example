package com.app.entities;

public class Customer {
String fname;
String lname;
int accno;
String address;
long phone;
public Customer(){

}

    public Customer(String fname, String lname, int accno, String address, long phone) {
        this.fname = fname;
        this.lname = lname;
        this.accno = accno;
        this.address = address;
        this.phone = phone;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", accno=" + accno +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }
}
