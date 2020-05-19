/**
 * Generate a line of description for each item
 */
public class LineItem{
    private Product product;
    private int quantity;

    LineItem(){
        product = null;
        quantity = 0;
    }

    /**
     * constructor that creates a product and assign quantity
     * @param p product's price
     * @param q product's quantity
     */
    LineItem(Product p,int q){
        product = p;
        quantity = q;
    }

    /**
     * Format a line item that includes
     * description, price, quantity, and total price
     * @return the format string
     */
    public String format() {
        return String.format("%-24s%-8s%2s%2s%.2f\n",product.getDescription() ,product.getPrice() , quantity ," ",product.getPrice()*quantity);
    }

    /**
     * Accessor
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Accessor
     * @return price
     */
    public double getPrice(){
        return product.getPrice();
    }
}
