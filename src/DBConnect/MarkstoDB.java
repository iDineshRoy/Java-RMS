/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DBConnect;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author roy
 */
public class MarkstoDB extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MarkstoDB() {
        initComponents();
        
    }
    public void storeMarks(String stId, String termExam, String Om, String year, String rn, String clas, String sub){
        
        int studid = Integer.parseInt(stId);
//        int terminalexam = Integer.parseInt(termExam);
        float om = Float.parseFloat(Om);
//        int fm = Integer.parseInt(Fm);
//        int rollno = Integer.parseInt(rn);
        
        try {
            DBconnection roy = new DBconnection();
            Connection con = roy.getConnection();            
            PreparedStatement pstmt;
            pstmt = con.prepareStatement("insert into om values(?,?,?,?,?,?,?)");
            pstmt.setInt(1, studid);
            pstmt.setString(2, sub);
            pstmt.setString(3, clas);
            pstmt.setString(4, rn);
            pstmt.setString(5, termExam);
            pstmt.setString(6, year);
            pstmt.setFloat(7, om);
            pstmt.executeUpdate();
        
        } catch (SQLException ex) {
            if(ex.getSQLState().equals("23000"))
            {
                JOptionPane.showMessageDialog(null, "Error: Duplicate entry!\nThe record already exists.");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"SQL Exception: "+ex.getMessage()+ "\nSQL State: "+ex.getSQLState()+
                    "\nVendor Error: "+ex.getErrorCode());
            }
            
            
        }
    }
    public void storeAttendance(String stId, String termExam, String attendance, String year, String rn, String clas){
        
        int studid = Integer.parseInt(stId);
        int att = Integer.parseInt(attendance);
//        int terminalexam = Integer.parseInt(termExam);
//        int fm = Integer.parseInt(Fm);
//        int rollno = Integer.parseInt(rn);
        try {
            DBConnect.DBconnection roy = new DBconnection();
            Connection con = roy.getConnection();
            
            PreparedStatement pstmt;
            pstmt = con.prepareStatement("insert into attendance values(?,?,?,?,?,?)");
            pstmt.setInt(1, att);
            pstmt.setInt(2, studid);
            pstmt.setString(3, clas);
            pstmt.setString(4, rn);
            pstmt.setString(5, termExam);
            pstmt.setString(6, year);
            pstmt.executeUpdate();
            
        
        } catch (SQLException ex) {
            if(ex.getSQLState().equals("23000"))
            {
                JOptionPane.showMessageDialog(null, "Error: Duplicate entry!\nThe record already exists.");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"SQL Exception: "+ex.getMessage()+ "\nSQL State: "+ex.getSQLState()+
                    "\nVendor Error: "+ex.getErrorCode());
            }
            
            
        }
    }
    public void marksEnglish(String stId, String termExam, String Om, String Fm, String rn, int clas){
        
        int studid = Integer.parseInt(stId);
        int terminalexam = Integer.parseInt(termExam);
        float om = Integer.parseInt(Om);
        int fm = Integer.parseInt(Fm);
        int rollno = Integer.parseInt(rn);
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmgmt","root","");
            System.out.println("Connection successfull!");
            PreparedStatement pstmt;
            pstmt = con.prepareStatement("insert into english values(?,?,?,?,?,?)");
            pstmt.setInt(1, studid);
            pstmt.setInt(2, terminalexam);
            pstmt.setFloat(3, om);
            pstmt.setInt(4, fm);
            pstmt.setInt(5, rollno);
            pstmt.setInt(6, clas);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Saved Successfully!");
        
        } catch (SQLException ex) {
            System.err.println("Unable to load driver!");
            JOptionPane.showMessageDialog(null,"SQL Exception: "+ex.getMessage()+ "\nSQL State: "+ex.getSQLState()+
                    "\nVendor Error: "+ex.getErrorCode());
            Logger.getLogger(MarkstoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void marksNepali(String stId, String termExam, String Om, String Fm, String rn, int clas){
        
        int studid = Integer.parseInt(stId);
        int terminalexam = Integer.parseInt(termExam);
        float om = Integer.parseInt(Om);
        int fm = Integer.parseInt(Fm);
        int rollno = Integer.parseInt(rn);
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmgmt","root","");
            System.out.println("Connection successfull!");
            PreparedStatement pstmt;
            pstmt = con.prepareStatement("insert into nepali values(?,?,?,?,?,?)");
            pstmt.setInt(1, studid);
            pstmt.setInt(2, terminalexam);
            pstmt.setFloat(3, om);
            pstmt.setInt(4, fm);
            pstmt.setInt(5, rollno);
            pstmt.setInt(6, clas);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Saved Successfully!");
        
        } catch (SQLException ex) {
            System.err.println("Unable to load driver!");
            JOptionPane.showMessageDialog(null,"SQL Exception: "+ex.getMessage()+ "\nSQL State: "+ex.getSQLState()+
                    "\nVendor Error: "+ex.getErrorCode());
            Logger.getLogger(MarkstoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void marksScience(String stId, String termExam, String Om, String Fm, String rn, int clas){
        
        int studid = Integer.parseInt(stId);
        int terminalexam = Integer.parseInt(termExam);
        float om = Integer.parseInt(Om);
        int fm = Integer.parseInt(Fm);
        int rollno = Integer.parseInt(rn);
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmgmt","root","");
            System.out.println("Connection successfull!");
            PreparedStatement pstmt;
            pstmt = con.prepareStatement("insert into science values(?,?,?,?,?,?)");
            pstmt.setInt(1, studid);
            pstmt.setInt(2, terminalexam);
            pstmt.setFloat(3, om);
            pstmt.setInt(4, fm);
            pstmt.setInt(5, rollno);
            pstmt.setInt(6, clas);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Saved Successfully!");
        
        } catch (SQLException ex) {
            System.err.println("Unable to load driver!");
            JOptionPane.showMessageDialog(null,"SQL Exception: "+ex.getMessage()+ "\nSQL State: "+ex.getSQLState()+
                    "\nVendor Error: "+ex.getErrorCode());
            Logger.getLogger(MarkstoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void marksSocial(String stId, String termExam, String Om, String Fm, String rn, int clas){
        
        int studid = Integer.parseInt(stId);
        int terminalexam = Integer.parseInt(termExam);
        float om = Integer.parseInt(Om);
        int fm = Integer.parseInt(Fm);
        int rollno = Integer.parseInt(rn);
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmgmt","root","");
            System.out.println("Connection successfull!");
            PreparedStatement pstmt;
            pstmt = con.prepareStatement("insert into social values(?,?,?,?,?,?)");
            pstmt.setInt(1, studid);
            pstmt.setInt(2, terminalexam);
            pstmt.setFloat(3, om);
            pstmt.setInt(4, fm);
            pstmt.setInt(5, rollno);
            pstmt.setInt(6, clas);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Saved Successfully!");
        
        } catch (SQLException ex) {
            System.err.println("Unable to load driver!");
            JOptionPane.showMessageDialog(null,"SQL Exception: "+ex.getMessage()+ "\nSQL State: "+ex.getSQLState()+
                    "\nVendor Error: "+ex.getErrorCode());
            Logger.getLogger(MarkstoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void marksMathematics(String stId, String termExam, String Om, String Fm, String rn, int clas){
        
        int studid = Integer.parseInt(stId);
        int terminalexam = Integer.parseInt(termExam);
        float om = Integer.parseInt(Om);
        int fm = Integer.parseInt(Fm);
        int rollno = Integer.parseInt(rn);
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmgmt","root","");
            System.out.println("Connection successfull!");
            PreparedStatement pstmt;
            pstmt = con.prepareStatement("insert into mathematics values(?,?,?,?,?,?)");
            pstmt.setInt(1, studid);
            pstmt.setInt(2, terminalexam);
            pstmt.setFloat(3, om);
            pstmt.setInt(4, fm);
            pstmt.setInt(5, rollno);
            pstmt.setInt(6, clas);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Saved Successfully!");
        
        } catch (SQLException ex) {
            System.err.println("Unable to load driver!");
            JOptionPane.showMessageDialog(null,"SQL Exception: "+ex.getMessage()+ "\nSQL State: "+ex.getSQLState()+
                    "\nVendor Error: "+ex.getErrorCode());
            Logger.getLogger(MarkstoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void marksGk(String stId, String termExam, String Om, String Fm, String rn, int clas){
        
        int studid = Integer.parseInt(stId);
        int terminalexam = Integer.parseInt(termExam);
        float om = Integer.parseInt(Om);
        int fm = Integer.parseInt(Fm);
        int rollno = Integer.parseInt(rn);
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmgmt","root","");
            System.out.println("Connection successfull!");
            PreparedStatement pstmt;
            pstmt = con.prepareStatement("insert into gk values(?,?,?,?,?,?)");
            pstmt.setInt(1, studid);
            pstmt.setInt(2, terminalexam);
            pstmt.setFloat(3, om);
            pstmt.setInt(4, fm);
            pstmt.setInt(5, rollno);
            pstmt.setInt(6, clas);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Saved Successfully!");
        
        } catch (SQLException ex) {
            System.err.println("Unable to load driver!");
            JOptionPane.showMessageDialog(null,"SQL Exception: "+ex.getMessage()+ "\nSQL State: "+ex.getSQLState()+
                    "\nVendor Error: "+ex.getErrorCode());
            Logger.getLogger(MarkstoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void marksEa(String stId, String termExam, String Om, String Fm, String rn, int clas){
        
        int studid = Integer.parseInt(stId);
        int terminalexam = Integer.parseInt(termExam);
        float om = Integer.parseInt(Om);
        int fm = Integer.parseInt(Fm);
        int rollno = Integer.parseInt(rn);
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmgmt","root","");
            System.out.println("Connection successfull!");
            PreparedStatement pstmt;
            pstmt = con.prepareStatement("insert into ea values(?,?,?,?,?,?)");
            pstmt.setInt(1, studid);
            pstmt.setInt(2, terminalexam);
            pstmt.setFloat(3, om);
            pstmt.setInt(4, fm);
            pstmt.setInt(5, rollno);
            pstmt.setInt(6, clas);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Saved Successfully!");
        
        } catch (SQLException ex) {
            System.err.println("Unable to load driver!");
            JOptionPane.showMessageDialog(null,"SQL Exception: "+ex.getMessage()+ "\nSQL State: "+ex.getSQLState()+
                    "\nVendor Error: "+ex.getErrorCode());
            Logger.getLogger(MarkstoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void marksPopulation(String stId, String termExam, String Om, String Fm, String rn, int clas){
        
        int studid = Integer.parseInt(stId);
        int terminalexam = Integer.parseInt(termExam);
        float om = Integer.parseInt(Om);
        int fm = Integer.parseInt(Fm);
        int rollno = Integer.parseInt(rn);
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmgmt","root","");
            System.out.println("Connection successfull!");
            PreparedStatement pstmt;
            pstmt = con.prepareStatement("insert into population values(?,?,?,?,?,?)");
            pstmt.setInt(1, studid);
            pstmt.setInt(2, terminalexam);
            pstmt.setFloat(3, om);
            pstmt.setInt(4, fm);
            pstmt.setInt(5, rollno);
            pstmt.setInt(6, clas);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Saved Successfully!");
        
        } catch (SQLException ex) {
            System.err.println("Unable to load driver!");
            JOptionPane.showMessageDialog(null,"SQL Exception: "+ex.getMessage()+ "\nSQL State: "+ex.getSQLState()+
                    "\nVendor Error: "+ex.getErrorCode());
            Logger.getLogger(MarkstoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void marksHealth(String stId, String termExam, String Om, String Fm, String rn, int clas){
        
        int studid = Integer.parseInt(stId);
        int terminalexam = Integer.parseInt(termExam);
        float om = Integer.parseInt(Om);
        int fm = Integer.parseInt(Fm);
        int rollno = Integer.parseInt(rn);
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmgmt","root","");
            System.out.println("Connection successfull!");
            PreparedStatement pstmt;
            pstmt = con.prepareStatement("insert into health values(?,?,?,?,?,?)");
            pstmt.setInt(1, studid);
            pstmt.setInt(2, terminalexam);
            pstmt.setFloat(3, om);
            pstmt.setInt(4, fm);
            pstmt.setInt(5, rollno);
            pstmt.setInt(6, clas);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Saved Successfully!");
        
        } catch (SQLException ex) {
            System.err.println("Unable to load driver!");
            JOptionPane.showMessageDialog(null,"SQL Exception: "+ex.getMessage()+ "\nSQL State: "+ex.getSQLState()+
                    "\nVendor Error: "+ex.getErrorCode());
            Logger.getLogger(MarkstoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void marksGulmohar(String stId, String termExam, String Om, String Fm, String rn, int clas){
        
        int studid = Integer.parseInt(stId);
        int terminalexam = Integer.parseInt(termExam);
        float om = Integer.parseInt(Om);
        int fm = Integer.parseInt(Fm);
        int rollno = Integer.parseInt(rn);
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmgmt","root","");
            System.out.println("Connection successfull!");
            PreparedStatement pstmt;
            pstmt = con.prepareStatement("insert into gulmohar values(?,?,?,?,?,?)");
            pstmt.setInt(1, studid);
            pstmt.setInt(2, terminalexam);
            pstmt.setFloat(3, om);
            pstmt.setInt(4, fm);
            pstmt.setInt(5, rollno);
            pstmt.setInt(6, clas);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Saved Successfully!");
        
        } catch (SQLException ex) {
            System.err.println("Unable to load driver!");
            JOptionPane.showMessageDialog(null,"SQL Exception: "+ex.getMessage()+ "\nSQL State: "+ex.getSQLState()+
                    "\nVendor Error: "+ex.getErrorCode());
            Logger.getLogger(MarkstoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void marksHealthandscience(String stId, String termExam, String Om, String Fm, String rn, int clas){
        
        int studid = Integer.parseInt(stId);
        int terminalexam = Integer.parseInt(termExam);
        float om = Integer.parseInt(Om);
        int fm = Integer.parseInt(Fm);
        int rollno = Integer.parseInt(rn);
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmgmt","root","");
            System.out.println("Connection successfull!");
            PreparedStatement pstmt;
            pstmt = con.prepareStatement("insert into hs values(?,?,?,?,?,?)");
            pstmt.setInt(1, studid);
            pstmt.setInt(2, terminalexam);
            pstmt.setFloat(3, om);
            pstmt.setInt(4, fm);
            pstmt.setInt(5, rollno);
            pstmt.setInt(6, clas);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Saved Successfully!");
        
        } catch (SQLException ex) {
            System.err.println("Unable to load driver!");
            JOptionPane.showMessageDialog(null,"SQL Exception: "+ex.getMessage()+ "\nSQL State: "+ex.getSQLState()+
                    "\nVendor Error: "+ex.getErrorCode());
            Logger.getLogger(MarkstoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void marksConversation(String stId, String termExam, String Om, String Fm, String rn, int clas){
        
        int studid = Integer.parseInt(stId);
        int terminalexam = Integer.parseInt(termExam);
        float om = Integer.parseInt(Om);
        int fm = Integer.parseInt(Fm);
        int rollno = Integer.parseInt(rn);
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmgmt","root","");
            System.out.println("Connection successfull!");
            PreparedStatement pstmt;
            pstmt = con.prepareStatement("insert into conversation values(?,?,?,?,?,?)");
            pstmt.setInt(1, studid);
            pstmt.setInt(2, terminalexam);
            pstmt.setFloat(3, om);
            pstmt.setInt(4, fm);
            pstmt.setInt(5, rollno);
            pstmt.setInt(6, clas);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Saved Successfully!");
        
        } catch (SQLException ex) {
            System.err.println("Unable to load driver!");
            JOptionPane.showMessageDialog(null,"SQL Exception: "+ex.getMessage()+ "\nSQL State: "+ex.getSQLState()+
                    "\nVendor Error: "+ex.getErrorCode());
            Logger.getLogger(MarkstoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void marksEnglishoral(String stId, String termExam, String Om, String Fm, String rn, int clas){
        
        int studid = Integer.parseInt(stId);
        int terminalexam = Integer.parseInt(termExam);
        float om = Integer.parseInt(Om);
        int fm = Integer.parseInt(Fm);
        int rollno = Integer.parseInt(rn);
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmgmt","root","");
            System.out.println("Connection successfull!");
            PreparedStatement pstmt;
            pstmt = con.prepareStatement("insert into eo values(?,?,?,?,?,?)");
            pstmt.setInt(1, studid);
            pstmt.setInt(2, terminalexam);
            pstmt.setFloat(3, om);
            pstmt.setInt(4, fm);
            pstmt.setInt(5, rollno);
            pstmt.setInt(6, clas);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Saved Successfully!");
        
        } catch (SQLException ex) {
            System.err.println("Unable to load driver!");
            JOptionPane.showMessageDialog(null,"SQL Exception: "+ex.getMessage()+ "\nSQL State: "+ex.getSQLState()+
                    "\nVendor Error: "+ex.getErrorCode());
            Logger.getLogger(MarkstoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void marksMathoral(String stId, String termExam, String Om, String Fm, String rn, int clas){
        
        int studid = Integer.parseInt(stId);
        int terminalexam = Integer.parseInt(termExam);
        float om = Integer.parseInt(Om);
        int fm = Integer.parseInt(Fm);
        int rollno = Integer.parseInt(rn);
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmgmt","root","");
            System.out.println("Connection successfull!");
            PreparedStatement pstmt;
            pstmt = con.prepareStatement("insert into mo values(?,?,?,?,?,?)");
            pstmt.setInt(1, studid);
            pstmt.setInt(2, terminalexam);
            pstmt.setFloat(3, om);
            pstmt.setInt(4, fm);
            pstmt.setInt(5, rollno);
            pstmt.setInt(6, clas);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Saved Successfully!");
        
        } catch (SQLException ex) {
            System.err.println("Unable to load driver!");
            JOptionPane.showMessageDialog(null,"SQL Exception: "+ex.getMessage()+ "\nSQL State: "+ex.getSQLState()+
                    "\nVendor Error: "+ex.getErrorCode());
            Logger.getLogger(MarkstoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void marksNepalioral(String stId, String termExam, String Om, String Fm, String rn, int clas){
        
        int studid = Integer.parseInt(stId);
        int terminalexam = Integer.parseInt(termExam);
        float om = Integer.parseInt(Om);
        int fm = Integer.parseInt(Fm);
        int rollno = Integer.parseInt(rn);
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmgmt","root","");
            System.out.println("Connection successfull!");
            PreparedStatement pstmt;
            pstmt = con.prepareStatement("insert into no values(?,?,?,?,?,?)");
            pstmt.setInt(1, studid);
            pstmt.setInt(2, terminalexam);
            pstmt.setFloat(3, om);
            pstmt.setInt(4, fm);
            pstmt.setInt(5, rollno);
            pstmt.setInt(6, clas);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Saved Successfully!");
        
        } catch (SQLException ex) {
            System.err.println("Unable to load driver!");
            JOptionPane.showMessageDialog(null,"SQL Exception: "+ex.getMessage()+ "\nSQL State: "+ex.getSQLState()+
                    "\nVendor Error: "+ex.getErrorCode());
            Logger.getLogger(MarkstoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void marksEnglishgrammar(String stId, String termExam, String Om, String Fm, String rn, int clas){
        
        int studid = Integer.parseInt(stId);
        int terminalexam = Integer.parseInt(termExam);
        float om = Integer.parseInt(Om);
        int fm = Integer.parseInt(Fm);
        int rollno = Integer.parseInt(rn);
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmgmt","root","");
            System.out.println("Connection successfull!");
            PreparedStatement pstmt;
            pstmt = con.prepareStatement("insert into eg values(?,?,?,?,?,?)");
            pstmt.setInt(1, studid);
            pstmt.setInt(2, terminalexam);
            pstmt.setFloat(3, om);
            pstmt.setInt(4, fm);
            pstmt.setInt(5, rollno);
            pstmt.setInt(6, clas);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Saved Successfully!");
        
        } catch (SQLException ex) {
            System.err.println("Unable to load driver!");
            JOptionPane.showMessageDialog(null,"SQL Exception: "+ex.getMessage()+ "\nSQL State: "+ex.getSQLState()+
                    "\nVendor Error: "+ex.getErrorCode());
            Logger.getLogger(MarkstoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void marksNepaligrammar(String stId, String termExam, String Om, String Fm, String rn, int clas){
        
        int studid = Integer.parseInt(stId);
        int terminalexam = Integer.parseInt(termExam);
        float om = Integer.parseInt(Om);
        int fm = Integer.parseInt(Fm);
        int rollno = Integer.parseInt(rn);
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmgmt","root","");
            System.out.println("Connection successfull!");
            PreparedStatement pstmt;
            pstmt = con.prepareStatement("insert into ng values(?,?,?,?,?,?)");
            pstmt.setInt(1, studid);
            pstmt.setInt(2, terminalexam);
            pstmt.setFloat(3, om);
            pstmt.setInt(4, fm);
            pstmt.setInt(5, rollno);
            pstmt.setInt(6, clas);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Saved Successfully!");
        
        } catch (SQLException ex) {
            System.err.println("Unable to load driver!");
            JOptionPane.showMessageDialog(null,"SQL Exception: "+ex.getMessage()+ "\nSQL State: "+ex.getSQLState()+
                    "\nVendor Error: "+ex.getErrorCode());
            Logger.getLogger(MarkstoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void storeNames(String studentname, String clas, String rollno, String studentid)
    {
        int studid = Integer.parseInt(studentid);
        int cls = Integer.parseInt(clas);
        int roll = Integer.parseInt(rollno);
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmgmt","root","");
            System.out.println("Connection successfull!");
            PreparedStatement pstmt;
            pstmt = con.prepareStatement("insert into names values(?,?, ?, ?)");
            pstmt.setString(1, studentname);
            pstmt.setInt(2, roll);
            pstmt.setInt(3, cls);
            pstmt.setInt(4, studid);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Saved Successfully!");
        
        } catch (SQLException ex) {
            System.err.println("Unable to load driver!");
            JOptionPane.showMessageDialog(null,"SQL Exception: "+ex.getMessage()+ "\nSQL State: "+ex.getSQLState()+
                    "\nVendor Error: "+ex.getErrorCode());
            Logger.getLogger(MarkstoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void enteredby(String clas, String username, String marksorname)
    {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmgmt","root","");
            
            PreparedStatement pstmt;
            pstmt = con.prepareStatement("insert into enteredby values(?,?,?)");
            pstmt.setString(1, clas);
            pstmt.setString(2, username);
            pstmt.setString(3, marksorname);
            pstmt.executeUpdate();
            //JOptionPane.showMessageDialog(null,"Record Saved Successfully!");
        
        } catch (SQLException ex) {
            System.err.println("Unable to load driver!");
            JOptionPane.showMessageDialog(null,"SQL Exception: "+ex.getMessage()+ "\nSQL State: "+ex.getSQLState()+
                    "\nVendor Error: "+ex.getErrorCode());
            Logger.getLogger(MarkstoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
