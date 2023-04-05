package org.example;

import com.app.entities.Account;
import com.app.entities.Customer;
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
        Account ac;
        ac = new Account(128990,"abc","12-2-2020");
        doaA.addAcc(ac);
        doaA.getAll();
        //doaA.deleteAcc();
        // doaA.updateAcc();

        CustDOA doaC=new CustDOA();
//          doaC.getAll();
//         Customer cs =new Customer("amruta","puppal",123442,"mumbai", 82686632);
        // cant add customer bcoz of the foreign key present in the table
//         doaC.addCustomer(cs);

//         doaC.updateCust();
//        doaC.deleteCust(124432);


    }
}