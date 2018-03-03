
import java.util.ArrayList;

public abstract class Room {

    private int roomNo;
    private int capacity;
    private ArrayList<Guest> guests;
    private String guestList;

    public Room(int roomNo, int capacity) {
        this.roomNo = roomNo;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.guestList = guestList;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getGuestNames() {
        guestList = "";
        for (Guest item : this.guests) {
             guestList = guestList + item.getName() + "; ";
        }
        return guestList;
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
        if (this.getNoOfGuests() < this.getCapacity())
        { this.guests.add(guest);
        }
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }
}
