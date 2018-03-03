
import java.util.ArrayList;

public abstract class Room {

    private int roomNo;
    private int capacity;
    private ArrayList<Guest> guests;
    private String list;

    public Room(int roomNo, int capacity) {
        this.roomNo = roomNo;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.list = list;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public String getGuestNames() {
        list = "";
        for (Guest item : this.guests) {
             list = list + item.getName() + "; ";
        }
        return list;
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
