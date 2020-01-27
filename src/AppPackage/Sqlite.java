/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import java.sql.*;
import javax.swing.JOptionPane;
public class Sqlite {
Connection conn=null;
public static Connection ConnectDB(){
    try{
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:database.sqlite");
        System.out.println("Connected");
        return conn;
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,"Error!! While Connecting "
                + "Database."
                + " Please Try Again Later");
    }
    return null;
    
}
}
    
    
