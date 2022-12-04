
package View_Invoices;

import Model_Invoices.Invoices;
import Model_Invoices.InvoicesTableModel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class InvDialog extends JDialog {
    private JTextField custNameField, invNumField;
    private JTextField invDateField;
    private JLabel custNameLbl,invNoLbl ;
    private JLabel invDateLbl;
    private JButton okBtn;
    private JButton cancelBtn;

    public InvDialog(InvGUI frame) {
        invNoLbl = new JLabel("Inv No:");
        invNumField = new JTextField(20);
        custNameLbl = new JLabel("Customer Name:");
        custNameField = new JTextField(20);
        invDateLbl = new JLabel("Invoice Date:");
        invDateField = new JTextField(20);
        okBtn = new JButton("OK");
        cancelBtn = new JButton("Cancel");
        
        okBtn.setActionCommand("Confirm");
        cancelBtn.setActionCommand("Close Inv");
        
        okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Invoices addedinvoice = new Invoices(Integer.parseInt(invNumField.getText()),invDateField.getText(),custNameField.getText());
                frame.getInvList().add(addedinvoice);
         
                InvoicesTableModel invoicesTableModel = new InvoicesTableModel(frame.getInvList());
                frame.setInvoicesTableModel(invoicesTableModel);
                frame.getInvoiceTable().setModel(invoicesTableModel);
                frame.getInvoicesTableModel().fireTableDataChanged();
                dispose();
            }
        });
        cancelBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setLayout(new GridLayout(4, 2));
        add(invNoLbl);
        add(invNumField);
        add(invDateLbl);
        add(invDateField);
        add(custNameLbl);
        add(custNameField);
        add(okBtn);
        add(cancelBtn);
        
        pack();
        
    }

    public JTextField getCustNameField() {
        return custNameField;
    }

    public JTextField getInvDateField() {
        return invDateField;
    }
    
}
