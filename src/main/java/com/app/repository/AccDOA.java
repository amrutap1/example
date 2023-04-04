package com.app.repository;

import com.app.entities.Account;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import static com.app.util.DBCon.con;

public class AccDOA {
    public ArrayList<Account> getAll() throws SQLException {
        ArrayList<Account> slist= new ArrayList<Account>();
        ResultSet r;
        try {
            Statement st = con.createStatement();
            r = st.executeQuery("select * from Account");
            while (r.next()) {
                int accno = r.getInt(1);
                String branch = r.getString(2);
                LocalDate doc = r.getDate(3).toLocalDate();

                Account a1 = new Account();
                a1.setAccno(accno);
                a1.setBranch(branch);
                a1.setDoc(doc);

                slist.add(a1);
                System.out.println(a1);
            }
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
        return slist;
    }
}
