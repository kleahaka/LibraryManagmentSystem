/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        bu3 = new javax.swing.JButton();
        bu1 = new javax.swing.JButton();
        bu4 = new javax.swing.JButton();
        bu5 = new javax.swing.JButton();
        bu6 = new javax.swing.JButton();
        bu2 = new javax.swing.JButton();
        bu7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DASHBOARD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 212, 43));

        bu3.setBackground(new java.awt.Color(204, 204, 255));
        bu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bu3.setText("REMOVE BOOKS");
        bu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu3ActionPerformed(evt);
            }
        });
        getContentPane().add(bu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 160, 50));

        bu1.setBackground(new java.awt.Color(204, 204, 255));
        bu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bu1.setText("BOOKS AVAILABLE");
        bu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu1ActionPerformed(evt);
            }
        });
        getContentPane().add(bu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 160, 50));

        bu4.setBackground(new java.awt.Color(204, 204, 255));
        bu4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bu4.setText("STAFF DETAILS");
        bu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu4ActionPerformed(evt);
            }
        });
        getContentPane().add(bu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 157, 50));

        bu5.setBackground(new java.awt.Color(204, 204, 255));
        bu5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bu5.setText("ADD STAFF");
        bu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu5ActionPerformed(evt);
            }
        });
        getContentPane().add(bu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 157, 50));

        bu6.setBackground(new java.awt.Color(204, 204, 255));
        bu6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bu6.setText("REMOVE STAFF");
        bu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu6ActionPerformed(evt);
            }
        });
        getContentPane().add(bu6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 157, 50));

        bu2.setBackground(new java.awt.Color(204, 204, 255));
        bu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bu2.setText("ADD BOOKS");
        bu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu2ActionPerformed(evt);
            }
        });
        getContentPane().add(bu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 160, 50));

        bu7.setBackground(new java.awt.Color(0, 204, 153));
        bu7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bu7.setText("EDIT ADMIN");
        bu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu7ActionPerformed(evt);
            }
        });
        getContentPane().add(bu7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 157, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Pictures\\blue-background-dark-blue-abstract-background-geometry-shine-and-layer-element-for-presentation-design-vector.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-350, 0, 1270, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu3ActionPerformed
        Remove_Book rm = new Remove_Book();
        rm.setVisible(true);
    }//GEN-LAST:event_bu3ActionPerformed

    private void bu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu1ActionPerformed
        BOOKS_AVAILABLE books = new BOOKS_AVAILABLE();
        books.setVisible(true);
    }//GEN-LAST:event_bu1ActionPerformed

    private void bu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu4ActionPerformed
        Staff_dt sf = new Staff_dt();
        sf.setVisible(true);
    }//GEN-LAST:event_bu4ActionPerformed

    private void bu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu5ActionPerformed
        Add_Staff ad = new Add_Staff();
        ad.setVisible(true);
    }//GEN-LAST:event_bu5ActionPerformed

    private void bu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu6ActionPerformed
        Remove_Staff rms = new Remove_Staff();
        rms.setVisible(true);
    }//GEN-LAST:event_bu6ActionPerformed

    private void bu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu2ActionPerformed
      ADD_BOOK addb = new ADD_BOOK();
      addb.setVisible(true);
    }//GEN-LAST:event_bu2ActionPerformed

    private void bu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu7ActionPerformed
        Edit_Admin adm = new Edit_Admin();
        adm.setVisible(true);
    }//GEN-LAST:event_bu7ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bu1;
    private javax.swing.JButton bu2;
    private javax.swing.JButton bu3;
    private javax.swing.JButton bu4;
    private javax.swing.JButton bu5;
    private javax.swing.JButton bu6;
    private javax.swing.JButton bu7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
