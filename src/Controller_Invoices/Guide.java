package Controller_Invoices;

import Model_Invoices.Invoices;
import Model_Invoices.InvoicesTableModel;
import Model_Invoices.InvItems;
import Model_Invoices.ItemsTableModel;
import View_Invoices.InvDialog;
import View_Invoices.InvGUI;
import View_Invoices.ItemsDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Guide implements ActionListener, ListSelectionListener {

    private InvGUI frame;
    private InvDialog invDialog;
    private ItemsDialog itDialog;

    public Guide() {
    }
    

    public Guide(InvGUI frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ac) {
        String actionCommand = ac.getActionCommand();
        System.out.println("Action: " + actionCommand);
        switch (actionCommand) {
          
            case "Create New Invoice":
                cNewInv();
                break;
            case "Delete Invoice":
                delInv();
                break;
            case "Create New Item":
                cNewItem();
                break;
            case "Delete Item":
                delItem();
                break;
            case "Load Invoice":
                loadInv();
                break;
            case "Save Invoice":
                savInv();
                break;
            case "Close Inv":
                cInvCancel();
                break;
            case "Confirm":
                cInvOK();
                break;
            case "item Confirm":
                cItemOK();
                break;
            case "createItemCancel":
                cItemCancel();
                break;
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int selectedIndex = frame.getInvoiceTable().getSelectedRow();
        if (selectedIndex != -1) {
            System.out.println("You have selected row: " + selectedIndex);
            Invoices currentInvoice = frame.getInvList().get(selectedIndex);
            frame.getInvoiceNumLabel().setText("" + currentInvoice.getNum());
            frame.getInvoiceDateLabel().setText(currentInvoice.getDate());
            frame.getCustomerNameLabel().setText(currentInvoice.getCustName());
            frame.getInvoiceTotalLabel().setText("" + currentInvoice.getInvoiceTotal());
            
            ItemsTableModel iTM = new ItemsTableModel(currentInvoice.getItems());
            frame.getItemsTable().setModel(iTM);
            iTM.fireTableDataChanged();
        }
    }

    private void loadInv() {
        
      JFileChooser fileChooser =new JFileChooser();
      
      try {
      int rslt = fileChooser.showOpenDialog(frame);
      if(rslt == JFileChooser.APPROVE_OPTION){
 
      File invFile = fileChooser.getSelectedFile();
      Path invoice = Paths.get(invFile.getAbsolutePath());
      List<String> invItems = Files.readAllLines(invoice);
        ArrayList<Invoices> invoicesArray= new ArrayList<>();
        for (String invItem : invItems) {
             try{
             String[] invComponents = invItem.split(",");
             int invNumber = Integer.parseInt(invComponents[0]);
             String invD = invComponents[1];
             String buyerN = invComponents[2];

         Invoices invC = new Invoices(invNumber, invD, buyerN);
         invoicesArray.add(invC);}catch(Exception k){
            JOptionPane.showMessageDialog(frame,
                    "Error in Item Format",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
         }    
        }
        
          
          
          rslt = fileChooser.showOpenDialog(frame);
                if(rslt == JFileChooser.APPROVE_OPTION){
                   File itemFile = fileChooser.getSelectedFile();
                   Path items = Paths.get(itemFile.getAbsolutePath());
                   List<String> itemItems = Files.readAllLines(items);
                  for (String itemItem : itemItems) {
                     
                     try{String[] itemdata = itemItem.split(",");
                    int invNum = Integer.parseInt( itemdata[0]);
                    String itN = itemdata[1];
                    double itP = Double.parseDouble(itemdata[2]);
                    int c =Integer.parseInt(itemdata[3]);
                    Invoices i = null;
                    for(Invoices invx :invoicesArray){
                    
                      if(invx.getNum() == invNum){
                       
                          i = invx;
                        break;
                      }  
                    }
                  InvItems item =new InvItems(itN,itP,c,i);
                  i.getItems().add(item);
                     }catch(Exception k){
            JOptionPane.showMessageDialog(frame,
                    "Error in Item Format",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                     }    
                  }
                    
                }
             frame.setInvList(invoicesArray);
             InvoicesTableModel invTM = new InvoicesTableModel(invoicesArray);
             frame.setInvoicesTableModel(invTM);
             frame.getInvoiceTable().setModel(invTM);
             frame.getInvoicesTableModel().fireTableDataChanged();
      
      
      }      
        
      }catch (IOException x){x.printStackTrace();
                       JOptionPane.showMessageDialog(frame, 
                               "Error in File Reading", 
                               "Error", 
                               JOptionPane.ERROR_MESSAGE);
                    } 

    }

    private void savInv() {
        ArrayList <Invoices> v=frame.getInvList();
        String header="";
        String items="";
        for(Invoices o: v){
          String CommonSeperatedValues= o.invseprated();
          header=header+CommonSeperatedValues;
          header=header+"\n";
          
          for(InvItems item :o.getItems()){
          
          String itemCommon=item.invseprated();
           items =items+itemCommon;
           items = items+"\n";
          }
        }
        
       try{JFileChooser fileChooser=new JFileChooser();
      int save= fileChooser.showSaveDialog(frame);
      if(save==JFileChooser.APPROVE_OPTION){
          File fH=fileChooser.getSelectedFile();
          FileWriter fw=new FileWriter(fH);
          fw.write(header);
          fw.flush();
          fw.close();
          save = fileChooser.showSaveDialog(frame);
          
        if(save==JFileChooser.APPROVE_OPTION){
          File fl=fileChooser.getSelectedFile();
           FileWriter iw=new FileWriter(fl);
          iw.write(items);
          iw.flush();
          iw.close();
        }  
      }
     }catch(IOException c){}

    }

    private void cNewInv() {
        invDialog = new InvDialog(frame);
        invDialog.setVisible(true);
    }

    private void delInv() {
        int selectedRow = frame.getInvoiceTable().getSelectedRow();
        if (selectedRow != -1) {
            frame.getInvList().remove(selectedRow);
            frame.getInvoicesTableModel().fireTableDataChanged();
        }
    }

    private void cNewItem() {
        itDialog = new ItemsDialog(frame);
        itDialog.setVisible(true);
    }

    private void delItem() {
        int selectedRow = frame.getItemsTable().getSelectedRow();

        if (selectedRow != -1) {
            ItemsTableModel itemTable = (ItemsTableModel) frame.getItemsTable().getModel();
            itemTable.getItems().remove(selectedRow);
            itemTable.fireTableDataChanged();
            frame.getInvoicesTableModel().fireTableDataChanged();
        }
    }

    private void cInvCancel() {
        invDialog.setVisible(false);
        invDialog.dispose();
        invDialog = null;
    }

    private void cInvOK() {
        String date = invDialog.getInvDateField().getText();
        String customer = invDialog.getCustNameField().getText();
        int num = frame.getNextInvoiceNum();
        try {
            String[] dateParts = date.split("-"); 
            if (dateParts.length < 3) {
                JOptionPane.showMessageDialog(frame, 
                                              "Wrong date format", "Error", 
                                              JOptionPane.ERROR_MESSAGE);
            } else {
                int day = Integer.parseInt(dateParts[0]);
                int month = Integer.parseInt(dateParts[1]);
                int year = Integer.parseInt(dateParts[2]);
                if (day > 31 || month > 12) {
                    JOptionPane.showMessageDialog(frame, 
                                                  "Wrong date format", "Error", 
                                                  JOptionPane.ERROR_MESSAGE);
                } else {
                    Invoices invoice = new Invoices(num, date, customer);
                    frame.getInvList().add(invoice);
                    frame.getInvoicesTableModel().fireTableDataChanged();
                    invDialog.setVisible(false);
                    invDialog.dispose();
                    invDialog = null;
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, 
                                          "Wrong date format", "Error",
                                          JOptionPane.ERROR_MESSAGE);
        }

    }

    private void cItemOK() {
        String item = itDialog.getItemNameField().getText();
        String countStr = itDialog.getItemCountField().getText();
        String priceStr = itDialog.getItemPriceField().getText();
        int count = Integer.parseInt(countStr);
        double price = Double.parseDouble(priceStr);
        int selectedInvoice = frame.getInvoiceTable().getSelectedRow();
        if (selectedInvoice != -1) {
            Invoices inv = frame.getInvList().get(selectedInvoice);
            InvItems items = new InvItems(item, price, count, inv);
            inv.getItems().add(items);
            ItemsTableModel itModel =(ItemsTableModel)  frame.getItemsTable().getModel();
            itModel.fireTableDataChanged();
            frame.getInvoicesTableModel().fireTableDataChanged();
        }
        itDialog.setVisible(false);
        itDialog.dispose();
        itDialog = null;
    }

    private void cItemCancel() {
        itDialog.setVisible(false);
        itDialog.dispose();
        itDialog = null;
    }

   

}
