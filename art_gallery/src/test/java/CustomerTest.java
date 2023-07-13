import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

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
    public void canSetWallet() {
        customer.setWallet(200);
        assertThat(customer.getWallet()).isEqualTo(200);
    }

}
