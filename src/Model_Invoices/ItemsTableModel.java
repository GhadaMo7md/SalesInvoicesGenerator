
package Model_Invoices;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ItemsTableModel extends AbstractTableModel {

    private ArrayList<InvItems> items;
    private String[] itTColumns = {"No.", "Item Name", "Item Price", "Count", "Item Total"};

    public ItemsTableModel(ArrayList<InvItems> items) {
        this.items = items;
    }

    public ArrayList<InvItems> getItems() {
        return items;
    }
    
    
    @Override
    public int getRowCount() {
        return items.size();
    }

    @Override
    public int getColumnCount() {
        return itTColumns.length;
    }

    @Override
    public String getColumnName(int x) {
        return itTColumns[x];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvItems item = items.get(rowIndex);
        
        switch(columnIndex) {
            case 0: return item.getInvoice().getNum();
            case 1: return item.getItem();
            case 2: return item.getPrice();
            case 3: return item.getCount();
            case 4: return item.getItemsTotal();
            default : return "";
        }
    }
    
}
