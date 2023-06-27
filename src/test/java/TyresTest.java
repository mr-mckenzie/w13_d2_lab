import com.SamMike.Vehicles.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Before
    public void before() {
        tyres = new Tyres();
    }

    @Test
    public void canSpin() {
        assertEquals("Weeeeee, I'm spinning!", tyres.spin());
    }
}
