import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {


    Guest guest1;
    Guest guest2;
    Guest guest3;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom;
    DiningRoom diningRoom;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    ArrayList<DiningRoom> diningRooms;
    Hotel hotel;


    @Before
    public void setUp() throws Exception {

        guest1 = new Guest("Jeff Bridges");
        guest2 = new Guest("Kevin Bacon");
        guest3 = new Guest("Shia LaBeouf");

        bedroom1 = new Bedroom(001, 2, 49.95);
        bedroom2 = new Bedroom(002, 1, 39.95);
        bedroom3 = new Bedroom(003, 2, 49.95);
        conferenceRoom = new ConferenceRoom(004, 200, 999.95);
        diningRoom = new DiningRoom(005, 70);

        bedrooms = new ArrayList<>();
        conferenceRooms = new ArrayList<>();
        diningRooms = new ArrayList<>();

        hotel = new Hotel(bedrooms, conferenceRooms, diningRooms);

        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        hotel.addConferenceRoom(conferenceRoom);
        hotel.addDiningRoom(diningRoom);
    }

    @Test
    public void hasBedrooms() {
        assertEquals(3, hotel.getBedroomCount());
    }
    @Test
    public void hasConferenceRooms() {
        assertEquals(1, hotel.getConferenceRoomCount());
    }
    @Test
    public void hasDiningRooms() {
        assertEquals(1, hotel.getDiningRoomCount());
    }

    @Test
    public void canCheckInGuest() {
        this.bedroom1.addGuest(guest1);
        assertEquals(1, this.bedroom1.getNoOfGuests());
    }

    @Test
    public void hotelCanCheckinGuest() {
        hotel.checkinGuest(guest1);
        assertEquals(1, this.bedroom1.getNoOfGuests());
    }

    @Test
    public void hotelCanCheckoutGuest() {
        hotel.checkinGuest(guest1);
        assertEquals(1, this.bedroom1.getNoOfGuests());
        hotel.checkoutGuest(guest1, bedroom1);
        assertEquals(0, this.bedroom1.getNoOfGuests());
    }

    @Test
    public void canGetGuestList() {
        hotel.checkinGuest(guest1);
        assertEquals("Jeff Bridges; ", bedroom1.getGuestNames());
    }


}
