
package View_Invoices;

import Controller_Invoices.Guide;
import Model_Invoices.Invoices;
import Model_Invoices.InvoicesTableModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;


public class InvGUI extends javax.swing.JFrame {

  
    public InvGUI() {
        this.getContentPane().setBackground(Color.magenta);
        initComponents();
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceTable = new javax.swing.JTable();
        invoiceTable.getSelectionModel().addListSelectionListener(guide);
        invoiceTable.setModel(getInvoicesTableModel());
        createInvoiceButton = new javax.swing.JButton();
        createInvoiceButton.addActionListener(guide);
        deleteInvoiceButton = new javax.swing.JButton();
        deleteInvoiceButton.addActionListener(guide);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        invoiceDateLabel = new javax.swing.JLabel();
        invoiceNumLabel = new javax.swing.JLabel();
        invoiceTotalLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        createItemButton = new javax.swing.JButton();
        createItemButton.addActionListener(guide);
        deleteItemButton = new javax.swing.JButton();
        deleteItemButton.addActionListener(guide);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadInv = new javax.swing.JMenuItem();
        loadInv.addActionListener(guide);
        saveInv = new javax.swing.JMenuItem();
        saveInv.addActionListener(guide);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jScrollPane1.setBackground(this.getContentPane().getBackground());

        invoiceTable.setBackground(this.getContentPane().getBackground());
        invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(invoiceTable);

        createInvoiceButton.setBackground(this.getContentPane().getBackground());
        createInvoiceButton.setText("Create New Invoice");

        deleteInvoiceButton.setBackground(this.getContentPane().getBackground());
        deleteInvoiceButton.setText("Delete Invoice");

        jLabel1.setBackground(this.getContentPane().getBackground());
        jLabel1.setText("Inoice Number");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(this.getContentPane().getBackground());
        jLabel2.setText("Invoice Date");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(this.getContentPane().getBackground());
        jLabel3.setText("Customer Name");
        jLabel3.setOpaque(true);

        jLabel4.setBackground(this.getContentPane().getBackground());
        jLabel4.setText("Invoice Total");
        jLabel4.setOpaque(true);

        customerNameLabel.setBackground(this.getContentPane().getBackground());
        customerNameLabel.setOpaque(true);

        invoiceDateLabel.setBackground(this.getContentPane().getBackground());
        invoiceDateLabel.setOpaque(true);

        invoiceNumLabel.setBackground(this.getContentPane().getBackground());
        invoiceNumLabel.setOpaque(true);

        invoiceTotalLabel.setBackground(this.getContentPane().getBackground());
        invoiceTotalLabel.setOpaque(true);

        jScrollPane2.setBackground(this.getContentPane().getBackground());

        itemTable.setBackground(this.getContentPane().getBackground());
        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(itemTable);

        createItemButton.setBackground(this.getContentPane().getBackground());
        createItemButton.setText("Create New Item");
        createItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createItemButtonActionPerformed(evt);
            }
        });

        deleteItemButton.setBackground(this.getContentPane().getBackground());
        deleteItemButton.setText("Delete Item");

        jMenu1.setText("File");

        loadInv.setText("Load Invoice");
        loadInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadInvActionPerformed(evt);
            }
        });
        jMenu1.add(loadInv);

        saveInv.setText("Save Invoice");
        jMenu1.add(saveInv);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(createInvoiceButton)
                        .addGap(131, 131, 131)
                        .addComponent(deleteInvoiceButton)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(invoiceTotalLabel))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(invoiceNumLabel))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(invoiceDateLabel))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(customerNameLabel)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(createItemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteItemButton)
                        .addGap(133, 133, 133))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(invoiceNumLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(invoiceDateLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(customerNameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(invoiceTotalLabel))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteInvoiceButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(createInvoiceButton)
                        .addComponent(createItemButton)
                        .addComponent(deleteItemButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadInvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadInvActionPerformed

    private void createItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createItemButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createItemButtonActionPerformed

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
            java.util.logging.Logger.getLogger(InvGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createInvoiceButton;
    private javax.swing.JButton createItemButton;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JButton deleteInvoiceButton;
    private javax.swing.JButton deleteItemButton;
    private javax.swing.JLabel invoiceDateLabel;
    private javax.swing.JLabel invoiceNumLabel;
    private javax.swing.JTable invoiceTable;
    private javax.swing.JLabel invoiceTotalLabel;
    private javax.swing.JTable itemTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loadInv;
    private javax.swing.JMenuItem saveInv;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Invoices> invList;
    private Guide guide = new Guide (this);
    private InvoicesTableModel invoicesTableModel;

    public ArrayList<Invoices> getInvList() {
        if (invList == null) invList = new ArrayList<>();
        return invList;
    }

    public void setInvList(ArrayList<Invoices> invList) {
        this.invList = invList;
    }

    public InvoicesTableModel getInvoicesTableModel() {
        if (invoicesTableModel == null) {
            invoicesTableModel = new InvoicesTableModel(getInvList());
        }
        return invoicesTableModel;
    }

    public void setInvoicesTableModel(InvoicesTableModel invoicesTableModel) {
        this.invoicesTableModel = invoicesTableModel;
    }

    public JLabel getCustomerNameLabel() {
        return customerNameLabel;
    }

    public JLabel getInvoiceDateLabel() {
        return invoiceDateLabel;
    }

    public JLabel getInvoiceNumLabel() {
        return invoiceNumLabel;
    }

    public JTable getInvoiceTable() {
        return invoiceTable;
    }

    public JLabel getInvoiceTotalLabel() {
        return invoiceTotalLabel;
    }

    public JTable getItemsTable() {
        return itemTable;
    }

    public Guide getGuide() {
        return guide;
    }
    
    public int getNextInvoiceNum() {
        int num = 0;
        
        for (Invoices invoice : getInvList()) {
            if (invoice.getNum() > num) 
                num = invoice.getNum();
        }
        
        return ++num;
    }

    
}
