
import project.connectionprovider;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mayur
 */
public class admitp extends javax.swing.JFrame {
public int flag=0;
    /**
     * Creates new form admitp
     */
    public admitp() {
        initComponents();
        jLabel2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(254, 254, 254));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Patient ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, -1, -1));

        jTextField1.setBackground(new java.awt.Color(254, 254, 254));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(1, 1, 1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 30, 169, -1));

        jButton1.setBackground(new java.awt.Color(254, 254, 254));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jButton1.setForeground(new java.awt.Color(20, 2, 2));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        jButton1.setText("search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 30, -1, -1));

        jLabel2.setBackground(new java.awt.Color(225, 1, 1));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Patient ID Does not exist !");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(254, 254, 254));
        jScrollPane1.setForeground(java.awt.Color.white);
        jScrollPane1.setFont(new java.awt.Font("Ubuntu", 1, 30)); // NOI18N

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setRowHeight(40);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 1870, 80));

        jButton2.setBackground(new java.awt.Color(254, 254, 254));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save-icon--1.png"))); // NOI18N
        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 900, -1, -1));

        jButton3.setBackground(new java.awt.Color(254, 254, 254));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        jButton3.setText("CLOSE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 900, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("LAB Report No.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Date of Admission");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Date of Discharge");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Allocate Room No.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Reason For Admit");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 660, -1, -1));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(1, 1, 1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 110, -1));

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(1, 1, 1));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 110, -1));

        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(1, 1, 1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 650, 370, 170));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 254, 254));
        jLabel10.setText("ADMIT WARD");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 10, -1, -1));

        jDateChooser1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 300, 50));

        jDateChooser2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 300, 50));

        jButton4.setBackground(new java.awt.Color(254, 254, 254));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jButton4.setForeground(new java.awt.Color(1, 1, 1));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save-icon--1.png"))); // NOI18N
        jButton4.setText("PRINT REPORT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 910, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 320, 910, 560));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jButton5.setText("RESET");
        jButton5.setToolTipText("");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 910, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/general1 copy.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 980));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String p_id=jTextField1.getText();
        try {
            Connection con = connectionprovider.getcon();
            Statement st = con.createStatement();
            ResultSet rs=st.executeQuery("select *from patient where patient_id='"+p_id+"'");
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            if(!rs.first())
                jLabel2.setVisible(true);
            else{
                jLabel2.setVisible(false);
                jTextField1.setEditable(false);
                flag=1;
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"connection error");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        if (flag==1)    
        {
            String p_id=jTextField1.getText();
            Integer.parseInt(p_id);
            String lab_report_no=jTextField2.getText();
            Integer.parseInt(lab_report_no);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date_of_admission = sdf.format(jDateChooser1.getDate());
          //  String date_of_admission=jTextField6.getText();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            String date_of_discharge = sdf1.format(jDateChooser2.getDate());
            //String date_of_discharge=jTextField3.getText();
            String room=jTextField4.getText();
            Integer.parseInt(room);
            String reason=jTextField5.getText();
            //is not done yet
            try {
            Connection con = connectionprovider.getcon();
            Statement st = con.createStatement();
            st.executeUpdate("insert into impatient values('" + p_id + "','" + lab_report_no + "','" + date_of_admission + "','" + date_of_discharge + "','" + room + "','" + reason + "')");
            JOptionPane.showMessageDialog(null, "Successfully Updated");
            //setVisible(false);
            //new admitp().setVisible(true);
            jTextArea1.setText("****************  VISHWARAJ HOSPITAL  ***************\n");
            jTextArea1.setText(jTextArea1.getText()+"*****************    Patient ADMIT WARD    ********************\n");
            jTextArea1.setText(jTextArea1.getText()+"*********************************************************\n");
            java.util.Date obj = new java.util.Date();
            String date2 = obj.toString();
            jTextArea1.setText(jTextArea1.getText()+"\nCurrent Date-:\t"+date2+"\n\n");   
           // jTextArea1.setText(jTextArea1.getText()+"LAB DATE-: "+date+"\n\n");   
            jTextArea1.setText(jTextArea1.getText()+"Patient ID.-: "+p_id+" \t\tLab Report No.-:"+lab_report_no+"\n\n");
            jTextArea1.setText(jTextArea1.getText()+"Date Of Admission -: "+date_of_admission+"\n\n");
            jTextArea1.setText(jTextArea1.getText()+"Date Of Discharge: "+date_of_discharge+"\n\n");
            jTextArea1.setText(jTextArea1.getText()+"Patient Room Number : "+room+"\n\n");
            jTextArea1.setText(jTextArea1.getText()+"Reason For Admit in Hospital : "+reason+"\n\n");
            jTextArea1.setText(jTextArea1.getText()+"                                                                       Signiture ");
            
            }
            catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data enter is incorrect");
            }
            
        }
        
        
        else  
            JOptionPane.showMessageDialog(null,"PatientID Field is EMPTY !");
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            jTextArea1.print();
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        // jTextArea1.setText("*****************\n");
        setVisible(false);
        new admitp().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admitp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admitp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admitp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admitp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admitp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}