public class Customer {

    private String name;
    private double wallet;

    public Customer(String customerName, double inputWallet) {
        this.name = customerName;
        this.wallet = inputWallet;
    }

    public String getCustomerName() {
        return this.name;
    }

    public double getWallet() {
        return this.wallet;
    }

    public void canSetWallet(double amount) {
        this.wallet = amount;
    }
}
