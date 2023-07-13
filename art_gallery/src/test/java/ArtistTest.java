import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {


    Artist artist;

    @BeforeEach
    public void setUp() {
        artist = new Artist("Bob");
    }

    @Test
    public void canGetName() {
        String actual = artist.getName();
        String expected = "Bob";
        assertThat(actual).isEqualTo(expected);

    }


}
