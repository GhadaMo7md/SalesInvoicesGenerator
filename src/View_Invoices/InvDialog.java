
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
//    private JTextField custNameField, invNumField;
    private JTextField custNameField;
    private JTextField invDateField;
    private JLabel custNameLbl;
    private JLabel invDateLbl;
    private JButton okBtn;
    private JButton cancelBtn;

    public InvDialog(InvGUI frame) {
        
        custNameLbl = new JLabel("Customer Name:");
        custNameField = new JTextField(20);
        invDateLbl = new JLabel("Invoice Date:");
        invDateField = new JTextField(20);
        okBtn = new JButton("OK");
        cancelBtn = new JButton("Cancel");
        
        okBtn.setActionCommand("Confirm");
        cancelBtn.setActionCommand("Close Inv");
        
        okBtn.addActionListener(frame.getGuide());
        cancelBtn.addActionListener(frame.getGuide());
        setLayout(new GridLayout(3, 2));
        setLayout(new GridLayout(4, 2));
        //add(invNoLbl);
        //add(invNumField);
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
