/**
 * The CustomerSerializer class provides methods for manually serializing Customer objects to JSON and XML formats.
 */
public class CustomerSerializer {

    /**
     * Serializes a Customer object to JSON format.
     *
     * @param customer the Customer object to serialize
     * @return the JSON representation of the Customer object
     */
    public static String toJson(Customer customer) {
        return String.format("{\"customerId\": %d, \"customerName\": \"%s\"}",
                customer.getCustomerId(), customer.getCustomerName());
    }

    /**
     * Serializes a Customer object to XML format.
     *
     * @param customer the Customer object to serialize
     * @return the XML representation of the Customer object
     */
    public static String toXml(Customer customer) {
        return String.format("<customer><customerId>%d</customerId><customerName>%s</customerName></customer>",
                customer.getCustomerId(), customer.getCustomerName());
    }
}