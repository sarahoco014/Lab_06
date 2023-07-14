import java.util.ArrayList;

public class Gallery {
    
    private String name;
    private double till;
    private ArrayList<Artwork> stock;
    
    public Gallery(String name) {
        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<Artwork>();
    }
    
    public String getGalleryName() {
        return this.name;
    }

    public double getTill() {
        return this.till;
    }
    
    public ArrayList<Artwork> getStock() {
        return this.stock;
    }
    
//    public int getCountArtwork() {
//        return this.stock.size();
//    }
//    public void addArtwork(Artwork newArtwork) {
//        this.stock.add(newArtwork);
//    }

    public void sellArtwork(double price, Customer customer) {
        customer.buyArtwork(price);
        this.till += price;
    }
    
}
