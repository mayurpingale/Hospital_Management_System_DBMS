/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mayur
 */

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author mayur
 */
public class NewClass {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","mayur2119");
            return con;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "no connection ");
            return null;
        }
    }
    
}
