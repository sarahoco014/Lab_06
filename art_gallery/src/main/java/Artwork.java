public class Artwork {

    private String title;
    private String artist;
    private double price;

    public Artwork(String inputTitle, String inputArtist, double inputPrice) {
        this.title = inputTitle;
        this.artist = inputArtist;
        this.price = inputPrice;
    }

    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double amount) {
        this.price = amount;
    }

}
