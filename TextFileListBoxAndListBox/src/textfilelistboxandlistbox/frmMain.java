/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfilelistboxandlistbox;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.DefaultListModel;
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

        BtnAddItem = new javax.swing.JButton();
        BtnMoveToListBox = new javax.swing.JButton();
        BtnCreateFile = new javax.swing.JButton();
        BtnWriteContents = new javax.swing.JButton();
        BtnClearListBoxes = new javax.swing.JButton();
        btnReadContents = new javax.swing.JButton();
        BtnMoveItemsToListBox = new javax.swing.JButton();
        txtInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstInput = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstDisplay = new javax.swing.JList();
        lblOutput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnAddItem.setText("Step 1: Add Item");
        BtnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddItemActionPerformed(evt);
            }
        });

        BtnMoveToListBox.setText("Step 2: Move to List Box");
        BtnMoveToListBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMoveToListBoxActionPerformed(evt);
            }
        });

        BtnCreateFile.setText("Step 3: Create File");
        BtnCreateFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateFileActionPerformed(evt);
            }
        });

        BtnWriteContents.setText("Step 4: Write Contents");
        BtnWriteContents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnWriteContentsActionPerformed(evt);
            }
        });

        BtnClearListBoxes.setText("Step 5: Clear List box");
        BtnClearListBoxes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearListBoxesActionPerformed(evt);
            }
        });

        btnReadContents.setText("Step 6:Read Contents");

        BtnMoveItemsToListBox.setText("Step 7:Move Items to List box");

        jScrollPane1.setViewportView(lstInput);

        jScrollPane2.setViewportView(lstDisplay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAddItem)
                    .addComponent(btnReadContents)
                    .addComponent(BtnClearListBoxes)
                    .addComponent(BtnCreateFile)
                    .addComponent(BtnMoveToListBox)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BtnMoveItemsToListBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(BtnWriteContents, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAddItem)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnMoveToListBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCreateFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnWriteContents)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnClearListBoxes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReadContents))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnMoveItemsToListBox)
                        .addGap(35, 35, 35)
                        .addComponent(lblOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
DefaultListModel<String> dlmList = new DefaultListModel<String>();
    private void BtnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddItemActionPerformed
    dlmList.addElement(txtInput.getText());
    lstInput.setModel(dlmList);
    txtInput.setText("");
    txtInput.requestFocusInWindow();// TODO add your handling code here:
    }//GEN-LAST:event_BtnAddItemActionPerformed
DefaultListModel<String> dlmDisplay = new DefaultListModel<>();
    private void BtnMoveToListBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMoveToListBoxActionPerformed
    int intIndex = lstInput.getModel().getSize();
    String[] arrSTr = new String[intIndex];
for(int i= 0; i<intIndex; i++)
{
    arrSTR[i] = lstInput.getModel().getElementAt(i);
}
for(int i=0; i<intIndex; i++)
        {
            try
            {
                dlmList.remove(i);
            }
            catch (Exception eX)
            {
                dlmList.remove(0);
            }
        }
    dlmList.clear();
    intIndex = arrSTR.length;
    for(int i=0; i<intIndex; i++)
    {
    dlmDisplay.addElement(arrSTR[i].toString());
    }
lstDisplay.setModel(dlmDisplay);// TODO add your handling code here:
    }//GEN-LAST:event_BtnMoveToListBoxActionPerformed

    private void BtnCreateFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateFileActionPerformed
File Textfile = new File("textfile.txt");
try
    {
        Textfile.createNewFile();
        lblOutput.setText("File has been Created");
    }
catch (exception Ex)
{
    JOptionPane.showMessageDialog(null,Ex);
}
    // TODO add your handling code here:
    }//GEN-LAST:event_BtnCreateFileActionPerformed

    private void BtnWriteContentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnWriteContentsActionPerformed
int intIndex = lstDisplay.getModel().getSize();
String[] arrSTR = new String[intIndex];
for(int i=0; i<intIndex; i++)
{
    arrSTR[i] = lstDisplay.getModel().getElementAt(i);
    try
    {
    String strfilename = "textfile.txt";
    FileWriter fw = new FileWriter(strfilename,true);
    fw.write(arrSTR[i] = "\r\n");
    fw.close();
    lblOutput.setText("content has been written to the file");
    }
    catch(Exception Ex)
    {
    JOptionPane.showMessageDialog(null,Ex);
    }
    }
}// TODO add your handling code here:
    }//GEN-LAST:event_BtnWriteContentsActionPerformed

    private void BtnClearListBoxesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearListBoxesActionPerformed
dlmList.removeAllElements();
dlmDisplay.removeAllElements();// TODO add your handling code here:
    }//GEN-LAST:event_BtnClearListBoxesActionPerformed

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
    private javax.swing.JButton BtnAddItem;
    private javax.swing.JButton BtnClearListBoxes;
    private javax.swing.JButton BtnCreateFile;
    private javax.swing.JButton BtnMoveItemsToListBox;
    private javax.swing.JButton BtnMoveToListBox;
    private javax.swing.JButton BtnWriteContents;
    private javax.swing.JButton btnReadContents;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JList lstDisplay;
    private javax.swing.JList lstInput;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}