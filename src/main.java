public class main {
    public static void main(String []args){
        Address shipping = new Address("00", "Lime Ave", "Long Beach", "CA", "09999");
        Address billing = new Address("99", "Watermelon Ave", "Torrance", "CA","78308");
        Invoice invoice = new Invoice(billing, shipping, 150);
        Product p1 = new Product("Toaster",29.95);
        Product p2 = new Product("Hair dryer",24.95);
        Product p3 = new Product("Car vacuum",19.99);
        invoice.addItem(p1,3);
        invoice.addItem(p2,1);
        invoice.addItem(p3,2);
        System.out.println(invoice.format());

    }
}
