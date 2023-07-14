public class Customer {

    private String name;
    private double wallet;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public String getCustomerName() {
        return this.name;
    }

    public double getWallet() {
        return this.wallet;
    }

    public void buyArtwork(double price) {
        this.wallet -= price;
    }

}


