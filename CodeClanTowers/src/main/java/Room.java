
import java.text.DecimalFormat;
import java.util.ArrayList;

public abstract class Room {

    private int roomNo;
    private int capacity;
    private ArrayList<Guest> guests;
    private String guestList;
    DecimalFormat numberFormat = new DecimalFormat("#.00");

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
             guestList = guestList + item.getName() + ", " + item.getDuration() + " night(s), bill: £" + numberFormat.format(item.getBill()) + "; ";
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

    public void addGuest(Guest guest, int duration) {
        if (this.getNoOfGuests() < this.getCapacity())
        { this.guests.add(guest);
        guest.setDuration(duration);
        }
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }
}


