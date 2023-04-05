package com.app.entities;

import java.sql.Date;
import java.time.LocalDate;

public class Account {

    int accno;
    String branch;
    LocalDate doc;

    public Account(){

    }
    public Account(int accno, String branch, LocalDate doc) {
        this.accno = accno;
        this.branch = branch;
        this.doc = doc;
    }

    public Account(int accno, String abc, String s) {
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Date getDoc() {
        return  Date;
    }

    public void setDoc(LocalDate doc) {
        this.doc = doc;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accno=" + accno +
                ", branch='" + branch + '\'' +
                ", doc=" + doc +
                '}';
    }
}
