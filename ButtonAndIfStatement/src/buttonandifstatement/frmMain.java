/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttonandifstatement;

import javax.swing.JOptionPane;


/**
 *
 * @author CHAD
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
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

        btnInput = new javax.swing.JButton();
        txtInput1 = new javax.swing.JTextField();
        txtInput2 = new javax.swing.JTextField();
        btnAddition = new javax.swing.JRadioButton();
        btnMultiply = new javax.swing.JRadioButton();
        btnSubtraction = new javax.swing.JRadioButton();
        btnDivision = new javax.swing.JRadioButton();
        lblOutput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInput.setText("INPUT");
        btnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputActionPerformed(evt);
            }
        });

        txtInput2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInput2ActionPerformed(evt);
            }
        });

        btnAddition.setText("+");
        btnAddition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdditionActionPerformed(evt);
            }
        });

        btnMultiply.setText("*");
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });

        btnSubtraction.setText("-");
        btnSubtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtractionActionPerformed(evt);
            }
        });

        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(txtInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddition)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInput)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSubtraction)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMultiply)
                                .addGap(4, 4, 4)
                                .addComponent(btnDivision)
                                .addGap(18, 18, 18)
                                .addComponent(txtInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubtraction)
                    .addComponent(btnAddition)
                    .addComponent(btnMultiply)
                    .addComponent(btnDivision))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInput)
                .addGap(27, 27, 27)
                .addComponent(lblOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed

       // TODO add your handling code here:
        int intInput1;
        int intInput2;
        String strOutput;
        int intOutput;
        intOutput = 0;
         intInput1 = Integer.parseInt(txtInput1.getText());
        intInput2 = Integer.parseInt(txtInput2.getText());
         try {
        intInput1 = Integer.parseInt(" ");
        }
        catch(Exception NoVariables1)
        {
        strOutput = "The first text box is empty";
        }
        try {
        intInput2 = Integer.parseInt(" ");
        }
        catch(Exception NoVariables2)
        {
        strOutput = "The second text box is empty";
        }
        if(btnAddition.isSelected())
        {
        intOutput = (intInput1 + intInput2);
        }
        if(btnSubtraction.isSelected());
        {
        intOutput = intInput1 - intInput2;
        }
        if(btnMultiply.isSelected());
        {
        intOutput = intInput1 - intInput2;
        }
        if(btnDivision.isSelected());
        {
        intOutput = intInput1 / intInput2;
        }
        JOptionPane.showMessageDialog(null, String.valueOf(intOutput));
    }//GEN-LAST:event_btnInputActionPerformed

    private void txtInput2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInput2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInput2ActionPerformed

    private void btnAdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdditionActionPerformed
if(btnAddition.isSelected())
{
btnSubtraction.setSelected(false);
btnMultiply.setSelected(false);
btnDivision.setSelected(false);
}// TODO add your handling code here:
    }//GEN-LAST:event_btnAdditionActionPerformed

    private void btnSubtractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtractionActionPerformed
if(btnSubtraction.isSelected())
{
btnAddition.setSelected(false);
btnMultiply.setSelected(false);
btnDivision.setSelected(false);
}// TODO add your handling code here:
    }//GEN-LAST:event_btnSubtractionActionPerformed

    private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplyActionPerformed
if(btnMultiply.isSelected())
{
btnSubtraction.setSelected(false);
btnAddition.setSelected(false);
btnDivision.setSelected(false); 
}// TODO add your handling code here:
    }//GEN-LAST:event_btnMultiplyActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
if(btnDivision.isSelected())
{
btnSubtraction.setSelected(false);
btnMultiply.setSelected(false);
btnAddition.setSelected(false);
}// TODO add your handling code here:
    }//GEN-LAST:event_btnDivisionActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnAddition;
    private javax.swing.JRadioButton btnDivision;
    private javax.swing.JButton btnInput;
    private javax.swing.JRadioButton btnMultiply;
    private javax.swing.JRadioButton btnSubtraction;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JTextField txtInput1;
    private javax.swing.JTextField txtInput2;
    // End of variables declaration//GEN-END:variables
}
