import java.util.ArrayList;

/**
 * Creates an Invoice format
 */
public class Invoice {
    Address shipping;
    Address billing;
    double payment;
    ArrayList<LineItem> lineItems = new ArrayList<>();
    Invoice(){
        shipping = null;
        billing = null;
        payment = 0;
        lineItems = null;
    }

    /**
     * Constructor
     * @param b billing address
     * @param s shipping address
     * @param p payment received from customer
     */
    Invoice(Address b, Address s, double p){
        shipping = s;
        billing = b;
        payment = p;
    }

    /**
     * Add product that the customer wants to buy
     * @param p Product
     * @param q quantity
     */
    public void addItem(Product p, int q){
        lineItems.add(new LineItem(p, q));
    }

    /**
     * Create an Invoice format
     * @return the String format of the invoice
     */
    public String format(){
        String format = "Invoice\n"+
                "------------------------------------------------------------------\n"+
                "Shipping Address: "+ shipping.format()+"\n"+
                "Billing Address: "+ billing.format()+
                "\n------------------------------------------------------------------\n\n"+
                "Description\t\t\t\tPrice\tQty\tTotal\n";
        for (int i=0; i<lineItems.size(); i++){
            format += lineItems.get(i).format();
        }
        format += String.format("%s%.2f%s%.2f%s%.2f","\nTOTAL AMOUNT DUE: ",computeTotal() ,
                "\nAMOUNT PAID: ", payment,
                "\nAMOUNT DUE: " ,amountDue());
        return format;
    }

    /**
     * Calculate the total price of each item
     * @return the total price of each item
     */
    public double computeTotal(){
        double price = 0;
        for (int i =0; i < lineItems.size(); i++){
            price += lineItems.get(i).getPrice()*lineItems.get(i).getQuantity();
        }
        return price;
    }

    /**
     * Calculate the amount the customers still owe after the payment
     * @return the amount due
     */
    public double amountDue(){
        return computeTotal() - payment;
    }
}
