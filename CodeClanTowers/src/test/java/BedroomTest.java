import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void setUp() throws Exception {
        bedroom = new Bedroom(001, 2, 49.95);
    }

    @Test
    public void hasCost() {
        assertEquals(49.95, bedroom.getCost(), 0.01);
    }

    @Test
    public void canSetCost() {
        bedroom.setCost(59.95);
        assertEquals(59.95, bedroom.getCost(), 0.01);
    }
}
