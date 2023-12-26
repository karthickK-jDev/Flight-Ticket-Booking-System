package Flight_Management_System;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Sudhir Kushwaha
 */
public class Connect {
    static Connection con=null;
    public static Connection ConnectToDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://sql12670608_crowdwild:de9c384905fe7bae2bae6ab7631271a2c482cab2@53u.h.filess.io:3307/sql12670608_crowdwild","sql12670608_crowdwild","de9c384905fe7bae2bae6ab7631271a2c482cab2");
            System.out.println(con);
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
}
}
