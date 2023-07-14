import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class GalleryTest {

Gallery gallery;

    @BeforeEach
    public void setUp() {
        gallery = new Gallery("Art Gallery");
}

    @Test
    public void canGetGalleryName(){
        String actual = gallery.getGalleryName();
        String expected = "Art Gallery";
        assertThat(actual).isEqualTo(expected);
}

    @Test
    public void canGetTill() {
        double actual = gallery.getTill();
        double expected = 0;
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void canGetStock() {
        ArrayList<Artwork> actual = gallery.getStock();
        ArrayList<Artwork> expected = new ArrayList<Artwork>();
        assertThat(actual).isEqualTo(expected);
    }

//    @Test
//    public void canCountArtwork() {
//        int actual = gallery.getCountArtwork();
//        int expected = 3;
//        assertThat(actual).isEqualTo(expected);
//}

//    @Test
//    public void canAddArtworkToGallery() {
//        Artwork flowers = new Artwork("Flowers", "Flora", 600);
//        gallery.addArtwork(flowers);
//        assertThat(gallery.getCountArtwork()).isEqualTo(4);
//}

//    @Test
//    public void canRemoveArtworkFromGallery() {
//        gallery.getCountArtwork();
//
//        double actual = gallery.getCountArtwork();
//        double expected = 2;
//
//        assertThat(actual).isEqualTo(expected);
//}

    @Test
    public void canSellArtwork() {
        Artist daVinci = new Artist("Da Vinci");
        Artwork monaLisa = new Artwork("Mona Lisa", daVinci, 100.5);
        Customer sarah = new Customer("Sarah", 2000);

        gallery.sellArtwork(monaLisa.getPrice(), sarah);

        double actualGalleryTill = gallery.getTill();
        double expectedGalleryTill = 100.5;

        double actualCustomerWallet = sarah.getWallet();
        double expectedCustomerWallet = 1899.5;

        assertThat(actualGalleryTill).isEqualTo(expectedGalleryTill);
        assertThat(actualCustomerWallet).isEqualTo(expectedCustomerWallet);
    }

}
