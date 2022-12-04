
package Model_Invoices;

public class InvItems {
    private String item;
    private double price;
    private int count;
    private Invoices invoice;

    public InvItems() {
    }

    public InvItems(String item, double price, int count, Invoices invoice) {
        this.item = item;
        this.price = price;
        this.count = count;
        this.invoice = invoice;
    }

    public double getItemsTotal() {
        double r=price * count;
        return r;
    }
    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "InvoiceItems{" + "num=" + invoice.getNum() + ", item=" + item + ", price=" + price + ", count=" + count + '}';
    }

    public Invoices getInvoice() {
        return invoice;
    }
    
    public String invseprated() {
        return invoice.getNum() + "," + item + "," + price + "," + count;
    }
    
}
