import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public int numberOfBedrooms() {
        return this.bedrooms.size();
    }

    public int numberOfConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public void checkInGuestBedroom(Bedroom bedroom, Guest guest) {
        bedroom.addGuest(guest);
    }

    public void checkInGuestConferenceRoom(ConferenceRoom conferenceRoom , Guest guest) {
        conferenceRoom.addGuest(guest);
    }
}
