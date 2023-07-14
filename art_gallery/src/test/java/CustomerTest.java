import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    Customer customer;

    @BeforeEach
    public void setUp() {
        customer = new Customer("Amy", 1000);
    }

    @Test
    public void canGetCustomerName() {
        String actual = customer.getCustomerName();
        String expected = "Amy";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetWallet() {
        double actual = customer.getWallet();
        double expected = 1000;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canBuyArtwork() {
        customer.buyArtwork(10.5);
        double actual = customer.getWallet();
        double expected = 989.5;
        assertThat(actual).isEqualTo(expected);
    }

}
