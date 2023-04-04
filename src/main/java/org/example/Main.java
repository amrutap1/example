package org.example;

import com.app.repository.AccDOA;
import com.app.repository.CustDOA;
import com.app.util.DBCon;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        System.out.println("Hello world!");
        DBCon.getConnection();

        AccDOA doaA= new AccDOA();
        doaA.getAll();

        CustDOA doaC=new CustDOA();
        doaC.getAll();


    }
}