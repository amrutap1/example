package com.app.repository;

import com.app.entities.Account;
import com.app.entities.Customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import static com.app.util.DBCon.con;

public class CustDOA {

    public ArrayList<Customer> getAll() throws SQLException {
        ArrayList<Customer> slist= new ArrayList<Customer>();
        ResultSet r;
        try {
            Statement st = con.createStatement();
            r = st.executeQuery("select * from Customer");
            while (r.next()) {
                String fname = r.getString(1);
                String lname = r.getString(2);
                int accno=r.getInt(3);
                String address=r.getString(4);
                long phone=r.getLong(5);
                Customer c1 = new Customer();
                c1.setFname(fname);
                c1.setLname(lname);
                c1.setAccno(accno);
                c1.setAddress(address);
                c1.setPhone(phone);
                slist.add(c1);
                System.out.println(c1);
            }
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
        return slist;
    }
    public int addCustomer(Customer cs) {

        String insertQuery = "insert into Customer(fname,lname,accno,address,phone) values(?,?,?,?,?)";

        int count = 0;

        try {
            PreparedStatement pstmt = con.prepareStatement(insertQuery);

            pstmt.setString(1,cs.getFname());
            pstmt.setString(2, cs.getLname());
            pstmt.setInt(3, cs.getAccno());
            pstmt.setString(4,cs.getAddress());
            pstmt.setLong(5,cs.getPhone());
            count = pstmt.executeUpdate();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return count;

    }

    public void updateCust()
    {
        Scanner sc = new Scanner(System.in);
        ResultSet rst;
        try{
            Statement st = con.createStatement();
            System.out.println("Provide Customer Account Number to update its details:");
            int accno = sc.nextInt();
            rst = st.executeQuery("SELECT * FROM Customer WHERE accno="+accno);
            if(!rst.next())
            {
                System.out.println("This acc no.doesn't exist!!");
            }
            else
            {
                sc.nextLine();
                System.out.println("Enter fname : ");
                String fname = sc.next();
                System.out.println("Enter lname : ");
                String lname = sc.next();
                String que = "UPDATE student set sname = '" + fname + "', email = '" + lname + "'" +
                        " WHERE accno= '" + accno + "' ";
                int ret = st.executeUpdate(que);
                if(ret > 0)
                {
                    System.out.println("Successfully updated!!");
                }
                else {
                    System.out.println("Something went wrong!!");
                }

            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
    public void deleteCust(int accno)
    {
        Scanner sc = new Scanner(System.in);
        ResultSet rst;
        try
        {
            Statement stmt = con.createStatement();
            rst = stmt.executeQuery( "SELECT * FROM Customer WHERE accno="+accno);
            if(!rst.next())
            {
                System.out.println("This roll no.doesn't exist!!");
            }
            else
            {
                String que = "delete from Customer where accno = '" +accno+ "' ";
                int ret = stmt.executeUpdate(que);
                if(ret > 0)
                {
                    System.out.println("Successfully deleted!!");
                }
                else {
                    System.out.println("Something went wrong!!");
                }
            }

        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
