/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dqkhanh
 */
public class Admin extends javax.swing.JFrame {
    
    private static Parking p;
    public static Queue<Vehicle> inQ = new ArrayDeque<>();
    public static Queue<Vehicle> outQ = new ArrayDeque<>();
    private static Vehicle []car;
    private static int []getParkingStatus;

    /**
     * Creates new form Admin
     */
    public Admin() throws FileNotFoundException, IOException {
        initComponents();
        setLocationRelativeTo(null);
        p = new Parking();
        FileOutputStream fileOutHistory = new FileOutputStream("history.txt");
        ObjectOutputStream outHistory = new ObjectOutputStream(fileOutHistory);
        FileOutputStream makeFile = new FileOutputStream("current.txt");
        getParkingStatus = new int[p.getCapacity()+1];
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        btnSystem = new javax.swing.JButton();
        btnCarInOut = new javax.swing.JButton();
        btnStatistic = new javax.swing.JButton();
        btnAccounts = new javax.swing.JButton();
        btnParkingVisualization = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");
        setBackground(new java.awt.Color(0, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Administrator");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(866, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(0, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(0, 204, 204));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));

        btnSystem.setBackground(new java.awt.Color(153, 204, 255));
        btnSystem.setIcon(new javax.swing.ImageIcon("C:\\Users\\dqkhanh\\Documents\\GitHub\\ParkingSystem-2.0\\ParkingSystem 2.0\\src\\main\\java\\Admin\\system.png")); // NOI18N
        btnSystem.setText("System"); // NOI18N
        btnSystem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSystem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSystemActionPerformed(evt);
            }
        });

        btnCarInOut.setBackground(new java.awt.Color(255, 153, 153));
        btnCarInOut.setIcon(new javax.swing.ImageIcon("C:\\Users\\dqkhanh\\Documents\\GitHub\\ParkingSystem-2.0\\ParkingSystem 2.0\\src\\main\\java\\Admin\\car.png")); // NOI18N
        btnCarInOut.setText("Car In And Out");
        btnCarInOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCarInOut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCarInOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarInOutActionPerformed(evt);
            }
        });

        btnStatistic.setBackground(new java.awt.Color(78, 169, 116));
        btnStatistic.setIcon(new javax.swing.ImageIcon("C:\\Users\\dqkhanh\\Documents\\GitHub\\ParkingSystem-2.0\\ParkingSystem 2.0\\src\\main\\java\\Admin\\statistic.png")); // NOI18N
        btnStatistic.setText("Statistic");
        btnStatistic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStatistic.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnStatistic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatisticActionPerformed(evt);
            }
        });

        btnAccounts.setBackground(new java.awt.Color(78, 134, 196));
        btnAccounts.setIcon(new javax.swing.ImageIcon("C:\\Users\\dqkhanh\\Documents\\GitHub\\ParkingSystem-2.0\\ParkingSystem 2.0\\src\\main\\java\\Admin\\account.png")); // NOI18N
        btnAccounts.setText("Accounts");
        btnAccounts.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAccounts.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountsActionPerformed(evt);
            }
        });

        btnParkingVisualization.setBackground(new java.awt.Color(153, 255, 153));
        btnParkingVisualization.setIcon(new javax.swing.ImageIcon("C:\\Users\\dqkhanh\\Documents\\GitHub\\ParkingSystem-2.0\\ParkingSystem 2.0\\src\\main\\java\\Admin\\Parkinggarage.png")); // NOI18N
        btnParkingVisualization.setText("Parking Visualization");
        btnParkingVisualization.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnParkingVisualization.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnParkingVisualization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParkingVisualizationActionPerformed(evt);
            }
        });

        btnLogOut.setBackground(new java.awt.Color(51, 51, 51));
        btnLogOut.setIcon(new javax.swing.ImageIcon("C:\\Users\\dqkhanh\\Documents\\GitHub\\ParkingSystem-2.0\\ParkingSystem 2.0\\src\\main\\java\\Admin\\152533.png")); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogOut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSystem, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(btnAccounts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCarInOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStatistic, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnParkingVisualization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCarInOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnParkingVisualization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSystem, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                .addGap(68, 85, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAccounts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnStatistic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStatisticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatisticActionPerformed
        new Statistic().setVisible(true);  
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_btnStatisticActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
                                                             
        new LoginForm().setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSystemActionPerformed
     new SysTemCRUD().setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_btnSystemActionPerformed

    private void btnCarInOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarInOutActionPerformed
        new CarInAndOut(p, inQ, outQ).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCarInOutActionPerformed

    private void btnAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountsActionPerformed
       new Account().setVisible(true);
       this.setVisible(false);
              // TODO add your handling code here:
    }//GEN-LAST:event_btnAccountsActionPerformed

    private void btnParkingVisualizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParkingVisualizationActionPerformed
        new Garage().setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btnParkingVisualizationActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Admin().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccounts;
    private javax.swing.JButton btnCarInOut;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnParkingVisualization;
    private javax.swing.JButton btnStatistic;
    private javax.swing.JButton btnSystem;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
