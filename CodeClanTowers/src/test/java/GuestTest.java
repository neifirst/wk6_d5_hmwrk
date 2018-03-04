import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void setUp() throws Exception {
        guest = new Guest("Jeff Bridges");
    }

    @Test
    public void hasName() {
        assertEquals("Jeff Bridges", guest.getName());
    }

    @Test
    public void hasZeroDuration() {
        assertEquals(0, guest.getDuration());
    }

    @Test
    public void hasZeroBill() {
        assertEquals(0.00, guest.getBill(), 0.01);
    }


}
