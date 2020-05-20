/*This is a change for pull request*/
/**
 * Format an address
 */
public class Address {
    private String house;
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(){
        house = "";
        street = "";
        city = "";
        state = "";
        zip = "";
    }

    /**
     * Constructor
     * @param h house
     * @param str street
     * @param c city
     * @param s state
     * @param z zip code
     */
    public Address(String h, String str, String c, String s, String z){
        house = h;
        street = str;
        city = c;
        state = s;
        zip = z;
    }

    /**
     * Create an address format
     * @return String address format
     */
    public String format(){
        return house +", "+street+", "+city+", "+state+" "+zip;
    }
}
