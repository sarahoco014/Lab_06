import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork artwork1;
    Artist artist1;

    @BeforeEach
    public void setUp() {
        artist1 = new Artist("Dave");
        artwork1 = new Artwork("Mona Lisa", artist1, 400);
    }

    @Test
    public void canGetTitle() {
        String actual = artwork1.getTitle();
        String expected = "Mona Lisa";
        assertThat(actual).isEqualTo(expected);
    }

//    @Test
//    public void canGetArtist() {
//        Artist actual = artwork1.getArtist();
//        Artist artist2 = new Artist("Dave");
//        assertThat(actual).isEqualTo(artist2);
//    }

    @Test
    public void canGetArtist() {
        String actualName = artwork1.getArtist().getName();
        String expectedName = "Dave";
        assertThat(actualName).isEqualTo(expectedName);
    }

    @Test
    public void canGetArtistName() {
        String actual = artwork1.getArtist().getName();
        String expected = "Dave";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetPrice() {
        double actual = artwork1.getPrice();
        double expected = 400;
        assertThat(actual).isEqualTo(expected);
    }


}
