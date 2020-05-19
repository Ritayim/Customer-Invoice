/**
 * Create an object product that includes description and price
 */
public class Product {
    private String description;
    private double price;
    Product(){
        description = "";
        price = 0;
    }

    /**
     * Constructor
     * @param d description of the product
     * @param p price
     */
    Product(String d, double p){
        description = d;
        price = p;
    }

    /**
     * mutator
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * mutator
     * @return price
     */
    public double getPrice() {
        return price;
    }
}
