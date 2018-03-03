import org.junit.Before;

import java.util.ArrayList;

public class HotelTest {


    Guest guest1;
    Guest guest2;
    Guest guest3;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom;
    DiningRoom diningRoom;
    ArrayList<Room> rooms;
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

        rooms = new ArrayList<>(bedroom1, bedroom2, bedroom3, conferenceRoom, diningRoom);

        hotel = new Hotel(rooms);
    }
}
