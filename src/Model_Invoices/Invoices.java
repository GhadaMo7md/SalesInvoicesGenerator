
package Model_Invoices;

import java.util.ArrayList;

public class Invoices {
    private int num;
    private String date;
    private String custName;
    private ArrayList<InvItems> items;
    
    public Invoices() {
    }

    public Invoices(int num, String date, String custName) {
        this.num = num;
        this.date = date;
        this.custName = custName;
    }

    public double getInvoiceTotal() {
        double total = 0.0;
        for (InvItems items  : getItems()) {
            total += items.getItemsTotal();
        }
        return total;
    }
    
    public ArrayList<InvItems> getItems() {
        if (items == null) {
            items = new ArrayList<>();
        }
        return items;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Invoice{" + "num=" + num + ", date=" + date + ", customer=" + custName + '}';
    }
    
    public String invseprated() {
        return num + "," + date + "," + custName;
    }
    
}
