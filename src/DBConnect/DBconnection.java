/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnect;
import java.sql.*;
import javax.swing.*;
import schoolmanagement.ConnectionFrame;

/**
 *
 * @author saraddulal
 */


public class DBconnection {
    
    
    String url = "jdbc:mysql://localhost:3306/schooldb";
    //String url = "jdbc:mysql://server.himalayanhost.com:2083/srnsbsedu_school";
    //String username = "srnsbsedu_admin";
    String username = "root";
    //String password = "rising nepal";
    String password = "guesswhat";
    public static String[] s= new String[4];
    Connection con = null;

    
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            ConnectionFrame r = new ConnectionFrame();
            //System.out.println(s[0]+""+ s[1]+""+ s[2]+""+ s[3]);
            con = DriverManager.getConnection("jdbc:mysql://"+s[0]+"/"+s[1], s[2], s[3]);
            //con = DriverManager.getConnection(url, username, password);
            return con;
        } 
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            System.exit(0);
            return null;
        }    
    }
    public void getStrings(String[] x)
    {
        s[0]=x[0];
        s[1]=x[1];
        s[2]=x[2];
        s[3]=x[3];
    }
    
}
