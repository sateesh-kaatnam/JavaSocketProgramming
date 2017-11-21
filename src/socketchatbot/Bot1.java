/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketchatbot;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sateesh_kaatnam
 */
public class Bot1 extends javax.swing.JFrame{

    /**
     * Creates new form Bot1
     */
    public Bot1() {
        initComponents();
    }
    static ServerSocket ssb1;
    static Socket sb1;
    static DataInputStream b1in;
    static DataOutputStream b1op;
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Bot1MsgArea = new javax.swing.JTextArea();
        Bot1TextField = new javax.swing.JTextField();
        Bot1Send = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hey Superman, Batman is Online.");
        setBackground(new java.awt.Color(0, 0, 0));

        Bot1MsgArea.setEditable(false);
        Bot1MsgArea.setBackground(new java.awt.Color(0, 0, 0));
        Bot1MsgArea.setColumns(20);
        Bot1MsgArea.setForeground(new java.awt.Color(51, 255, 0));
        Bot1MsgArea.setRows(5);
        jScrollPane1.setViewportView(Bot1MsgArea);

        Bot1TextField.setBackground(new java.awt.Color(0, 0, 0));
        Bot1TextField.setForeground(new java.awt.Color(0, 255, 0));
        Bot1TextField.setText("Enter Text Here");
        Bot1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot1TextFieldActionPerformed(evt);
            }
        });

        Bot1Send.setBackground(new java.awt.Color(0, 0, 0));
        Bot1Send.setForeground(new java.awt.Color(51, 255, 0));
        Bot1Send.setText("Send");
        Bot1Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot1SendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bot1TextField))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(Bot1Send)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bot1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bot1Send)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bot1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bot1TextFieldActionPerformed

    private void Bot1SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot1SendActionPerformed
        // TODO add your handling code here:
        String msgSend="";
        msgSend=Bot1TextField.getText().trim();
        try {
            b1op.writeUTF(msgSend);
            Bot1MsgArea.append("\nYou: "+msgSend);
        } catch (IOException ex) {
            System.out.println("Error in sending data from Bot1..!");
        }
    }//GEN-LAST:event_Bot1SendActionPerformed

    /**
     * @param args the command line arguments
     */
  
     public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(Bot1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bot1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bot1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bot1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bot1().setVisible(true);
            }
        });
        String inpb1="";
        try{
            ssb1= new ServerSocket(1201);
            sb1= ssb1.accept();
            b1in= new DataInputStream(sb1.getInputStream());
            b1op= new DataOutputStream(sb1.getOutputStream());
            while(!inpb1.equals("exit")){
                inpb1=b1in.readUTF();
                Bot1MsgArea.setText(Bot1MsgArea.getText().trim()+"\nBatman: "+inpb1);
            }
            
            
            
        }catch (Exception err){
            
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextArea Bot1MsgArea;
    private javax.swing.JButton Bot1Send;
    private javax.swing.JTextField Bot1TextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
