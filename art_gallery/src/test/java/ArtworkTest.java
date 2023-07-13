import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork artwork;

    @BeforeEach
    public void setUp() {
        artwork = new Artwork("Mona Lisa", "Dave", 400);
    }

    @Test
    public void canGetTitle() {
        String actual = artwork.getTitle();
        String expected = "Mona Lisa";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetArtist() {
        String actual = artwork.getArtist();
        String expected = "Dave";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canGetPrice() {
        double actual = artwork.getPrice();
        double expected = 400;
        assertThat(actual).isEqualTo(expected);
    }
    
    @Test
    public void canSetPrice() {
        artwork.setPrice(500);
        assertThat(artwork.getPrice()).isEqualTo(500);
    }

}
