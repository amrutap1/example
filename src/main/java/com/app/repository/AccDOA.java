package com.app.repository;

import com.app.entities.Account;
import com.app.entities.Customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

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
    public int addAcc(Account ac) {

        String insertQuery = "insert into Account(accno,branch, date) values(?,?,?)";

        int count = 0;

        try {
            PreparedStatement pstmt = con.prepareStatement(insertQuery);

            pstmt.setInt(1,ac.getAccno());
            pstmt.setString(2, ac.getBranch());
            pstmt.setDate(3, ac.getDoc());
            count = pstmt.executeUpdate();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return count;

    }

    public void updateAcc()
    {
        Scanner sc = new Scanner(System.in);
        ResultSet rst;
        try{
            Statement st = con.createStatement();
            System.out.println("Provide Account Number to update its details:");
            int accno = sc.nextInt();
            rst = st.executeQuery("SELECT * FROM Customer WHERE accno="+accno);
            if(!rst.next())
            {
                System.out.println("This acc no.doesn't exist!!");
            }
            else
            {
                sc.nextLine();
                System.out.println("Enter branch : ");
                String branch = sc.next();
                System.out.println("Enter date / month / year: ");
                String date= sc.next();
                String month=sc.next();
                String year=sc.next();
                String in=date+ "/"+ month +"/" +year;
                SimpleDateFormat dateFormat=new SimpleDateFormat("dd/mm/yyyy");
                Date theDate=dateFormat.parse(in);
//                System.out.println("Date parsed = "+ dateFormat.format(theDate));
                String que = "UPDATE student set branch = '" + branch + "', doc = '" + dateFormat.format(theDate)+ "'" +
                        " WHERE accno = '" + accno + "' ";
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
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public void deleteAcc()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter accno:");
        int accno=sc.nextInt();
        ResultSet rst;
        try
        {
            Statement stmt = con.createStatement();
            rst = stmt.executeQuery( "SELECT * FROM Account WHERE accno="+accno);
            if(!rst.next())
            {
                System.out.println("This roll no.doesn't exist!!");
            }
            else
            {
                String que = "delete from Account where accno = '" +accno+ "' ";
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
