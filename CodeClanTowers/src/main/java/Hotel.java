import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DiningRoom> diningRooms;
    private String vacantList;


    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms, ArrayList<DiningRoom> diningRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = diningRooms;
        this.vacantList = vacantList;
    }


    public int getBedroomCount() {
        if (bedrooms == null) {
            return 0;
        } else {
            return this.bedrooms.size();
        }
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public int getConferenceRoomCount() {
        if (conferenceRooms == null) {
            return 0;
        } else {
            return this.conferenceRooms.size();
        }
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public int getDiningRoomCount() {
        if (diningRooms == null) {
            return 0;
        } else {
            return this.diningRooms.size();
        }
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        this.diningRooms.add(diningRoom);
    }




    public void checkinGuest(Guest guest, int duration) {
        for (Bedroom item : bedrooms) {
            if (item.getNoOfGuests() < 1 ) {
                item.addGuest(guest, duration);
                guest.setBill(item.getCost() * duration);
                break;
            }

        }

    }

    public void checkoutGuest(Guest guest, Bedroom bedroom) {
        bedroom.removeGuest(guest);
    }

    public String getGuestList(Bedroom bedroom) {
        return bedroom.getGuestNames();
    }

    public String seeVacant() {
        vacantList = "";
        for (Bedroom item : bedrooms) {
            if (item.getNoOfGuests() == 0) {
                vacantList = vacantList + "Room " + item.getRoomNo() + "; ";
            }
        }
        return vacantList;
    }


}

