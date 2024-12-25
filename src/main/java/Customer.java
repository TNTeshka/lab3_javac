import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The Customer class represents a customer with an ID and name.
 */
@XmlJsonRoot("customer")
@Data
@AllArgsConstructor
public class Customer {

    @XmlJsonField("customerId")
    private int customerId;

    @XmlJsonField("customerName")
    private String customerName;
}