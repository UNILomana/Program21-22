/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

/**
 *
 * @author lomana.markel
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View() {
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

        jDialogHiztegiaIkusi = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jDialogTerminoaGehitu = new javax.swing.JDialog();
        jLabelEuskaraz1 = new javax.swing.JLabel();
        jLabelGazteleraz1 = new javax.swing.JLabel();
        jLabelTitulua1 = new javax.swing.JLabel();
        jTextFieldEuskaraz3 = new javax.swing.JTextField();
        jTextFieldGazteleraz1 = new javax.swing.JTextField();
        jButtonTxertatu1 = new javax.swing.JButton();
        jLabelTitulua = new javax.swing.JLabel();
        jTextFieldEuskaraz = new javax.swing.JTextField();
        jTextFieldGazteleraz = new javax.swing.JTextField();
        jButtonTxertatu = new javax.swing.JButton();
        jButtonIrten = new javax.swing.JButton();
        jLabelEuskaraz = new javax.swing.JLabel();
        jLabelGazteleraz = new javax.swing.JLabel();
        jButtonTGehitu = new javax.swing.JButton();
        jButtonTIkusi = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jDialogHiztegiaIkusiLayout = new javax.swing.GroupLayout(jDialogHiztegiaIkusi.getContentPane());
        jDialogHiztegiaIkusi.getContentPane().setLayout(jDialogHiztegiaIkusiLayout);
        jDialogHiztegiaIkusiLayout.setHorizontalGroup(
            jDialogHiztegiaIkusiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogHiztegiaIkusiLayout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(142, 142, 142))
        );
        jDialogHiztegiaIkusiLayout.setVerticalGroup(
            jDialogHiztegiaIkusiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogHiztegiaIkusiLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        jLabelEuskaraz1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelEuskaraz1.setText("Euskaraz");

        jLabelGazteleraz1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelGazteleraz1.setText("Gazteleraz");

        jLabelTitulua1.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabelTitulua1.setText("Hitz berria");

        jTextFieldEuskaraz3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEuskaraz3ActionPerformed(evt);
            }
        });

        jTextFieldGazteleraz1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGazteleraz1ActionPerformed(evt);
            }
        });

        jButtonTxertatu1.setText("TXERTATU");

        javax.swing.GroupLayout jDialogTerminoaGehituLayout = new javax.swing.GroupLayout(jDialogTerminoaGehitu.getContentPane());
        jDialogTerminoaGehitu.getContentPane().setLayout(jDialogTerminoaGehituLayout);
        jDialogTerminoaGehituLayout.setHorizontalGroup(
            jDialogTerminoaGehituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogTerminoaGehituLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jDialogTerminoaGehituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulua1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDialogTerminoaGehituLayout.createSequentialGroup()
                        .addGroup(jDialogTerminoaGehituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEuskaraz1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelGazteleraz1))
                        .addGap(18, 18, 18)
                        .addGroup(jDialogTerminoaGehituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldGazteleraz1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jTextFieldEuskaraz3))))
                .addContainerGap(171, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogTerminoaGehituLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonTxertatu1)
                .addGap(36, 36, 36))
        );
        jDialogTerminoaGehituLayout.setVerticalGroup(
            jDialogTerminoaGehituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogTerminoaGehituLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelTitulua1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jDialogTerminoaGehituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEuskaraz3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEuskaraz1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jButtonTxertatu1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jDialogTerminoaGehituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGazteleraz1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGazteleraz1))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulua.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabelTitulua.setText("Hitz berria_Nagusia");

        jTextFieldEuskaraz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEuskarazActionPerformed(evt);
            }
        });

        jTextFieldGazteleraz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGaztelerazActionPerformed(evt);
            }
        });

        jButtonTxertatu.setText("TXERTATU_ez du balio");
        jButtonTxertatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTxertatuActionPerformed(evt);
            }
        });

        jButtonIrten.setText("IRTEN");

        jLabelEuskaraz.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelEuskaraz.setText("Euskaraz");

        jLabelGazteleraz.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelGazteleraz.setText("Gazteleraz");

        jButtonTGehitu.setText("Terminoa Gehitu");
        jButtonTGehitu.setActionCommand("DIALOG");

        jButtonTIkusi.setText("Terminoak Ikusi");
        jButtonTIkusi.setActionCommand("IMPRIMATU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEuskaraz, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelGazteleraz))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldGazteleraz, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jTextFieldEuskaraz)))
                    .addComponent(jLabelTitulua, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonTIkusi)
                    .addComponent(jButtonIrten, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTGehitu)
                    .addComponent(jButtonTxertatu))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelTitulua, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEuskaraz, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEuskaraz, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGazteleraz, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGazteleraz))
                .addGap(4, 4, 4)
                .addComponent(jButtonTIkusi)
                .addGap(18, 18, 18)
                .addComponent(jButtonTGehitu)
                .addGap(59, 59, 59)
                .addComponent(jButtonIrten, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonTxertatu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEuskarazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEuskarazActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEuskarazActionPerformed

    private void jTextFieldGaztelerazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGaztelerazActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGaztelerazActionPerformed

    private void jButtonTxertatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTxertatuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTxertatuActionPerformed

    private void jTextFieldEuskaraz3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEuskaraz3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEuskaraz3ActionPerformed

    private void jTextFieldGazteleraz1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGazteleraz1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGazteleraz1ActionPerformed
    
    /**
     * Exekutatzen du Frame-a modu seguruan.
     * View objetua sortzen du
     * @return 
     */
    public static View viewaSortuBistaratu() {
        View v = new View();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                v.setVisible(true);
            }
        });
        return v;
    }
    
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new View().setVisible(true);
//            }
//        });
//    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton jButtonIrten;
    javax.swing.JButton jButtonTGehitu;
    javax.swing.JButton jButtonTIkusi;
    javax.swing.JButton jButtonTxertatu;
    javax.swing.JButton jButtonTxertatu1;
    javax.swing.JDialog jDialogHiztegiaIkusi;
    javax.swing.JDialog jDialogTerminoaGehitu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEuskaraz;
    private javax.swing.JLabel jLabelEuskaraz1;
    private javax.swing.JLabel jLabelGazteleraz;
    private javax.swing.JLabel jLabelGazteleraz1;
    private javax.swing.JLabel jLabelTitulua;
    private javax.swing.JLabel jLabelTitulua1;
    javax.swing.JTextField jTextFieldEuskaraz;
    javax.swing.JTextField jTextFieldEuskaraz1;
    javax.swing.JTextField jTextFieldEuskaraz2;
    javax.swing.JTextField jTextFieldEuskaraz3;
    javax.swing.JTextField jTextFieldGazteleraz;
    javax.swing.JTextField jTextFieldGazteleraz1;
    // End of variables declaration//GEN-END:variables
}
