
import java.util.ArrayList;

public abstract class Room {

    private int roomNo;
    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int roomNo, int capacity) {
        this.roomNo = roomNo;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getRoomNo() {
        return roomNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNoOfGuests() {
        if (guests == null)
        { return 0;
        }
        else
        { return this.guests.size();
        }
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }
}
