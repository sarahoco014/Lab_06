import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

Gallary gallery;

@BeforeEach
public void setUp() {
    gallery = new Gallery("Art Gallery",1000);
    Artwork thestarrynight = new Artwork("The Starry Night", "Vincent van Gogh", 1000);
    Artwork thescream = new Artwork("The Scream", "Edvard Munch", 2000);
    Artwork olympia = new Artwork("Olympia", "Manet", 3000);
    gallery.addArtwork(thestarrynight);
    gallery.addArtwork(thescream);
    gallery.addArtwork(olympia);
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
    double expected = 1000;
    assertThat(actual).isEqualTo(expected);

}

@Test
public void canCountArtwork() {
    int actual = gallery.getCountArtwork;
    int expected = 3;
    assertThat(actual).isEqualTo(expected);
}

public void canAddArtworkToGallery() {
    Artwork flowers = new Artwork("Flowers", "Flora", 600);
    gallery.addArtwork(flowers);
    assertThat(gallery.getCountArtwork()).isEqualTo(4);
}
    

}
