/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
/**
 *
 * @author mayur
 */
public class test {
    private static final String U="root";
    private static final String P="mayur2119";
    private static final String C="jdbc:mysql://localhost:3306/project?autoReconnect=true&useSSL=false";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection conn =null;
        try {
            conn = DriverManager.getConnection(C,P,U);
            System.out.println("Connected");
        } catch (SQLException  e) {
            System.err.println(e);
        }
    }
    
}
