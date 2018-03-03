import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    ArrayList<Guest> guests;

    @Before
    public void setUp() throws Exception {
        room = new Bedroom(001, 2, 49.95);
        guest1 = new Guest("Jeff Bridges");
        guest2 = new Guest("Kevin Bacon");
        guest3 = new Guest("Shia LaBeouf");
        guests = new ArrayList<>();
    }

    @Test
    public void hasRoomNo() {
        assertEquals(001, room.getRoomNo());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, room.getCapacity());
    }


    @Test
    public void canGetGuestsNames() {
        room.addGuest(guest1);
        room.addGuest(guest2);
        assertEquals("Jeff Bridges; Kevin Bacon; ", room.getGuestNames());
    }

    @Test
    public void canGetGuestsNames__Empty() {
        assertEquals("", room.getGuestNames());
    }

    @Test
    public void canGetNumberOfGuests() {
        assertEquals(0, room.getNoOfGuests());
    }

    @Test
    public void canAddGuest() {
        room.addGuest(guest1);
        room.addGuest(guest2);
        assertEquals(2, room.getNoOfGuests());
    }

    @Test
    public void cantAddGuest() {
        room.addGuest(guest1);
        room.addGuest(guest2);
        room.addGuest(guest3);
        assertEquals(2, room.getNoOfGuests());
    }

    @Test
    public void canRemoveGuest() {
        room.addGuest(guest1);
        room.addGuest(guest2);
        assertEquals(2, room.getNoOfGuests());
        room.removeGuest(guest1);
        assertEquals(1, room.getNoOfGuests());
    }


}
