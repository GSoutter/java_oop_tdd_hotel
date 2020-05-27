import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = new HashMap<String, DiningRoom>();
    }

    public int numberOfBedrooms() {
        return this.bedrooms.size();
    }

    public int numberOfConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public void checkInGuestBedroom(Bedroom bedroom, Guest guest) {

        if (bedroom.numberOfGuests() == 0) {
            bedroom.addGuest(guest);
        }
    }

    public void checkInGuestConferenceRoom(ConferenceRoom conferenceRoom , Guest guest) {
        conferenceRoom.addGuest(guest);
    }

    public Booking bookBedroom(Bedroom bedroom, int numberOfNights) {
        double bill = bedroom.getNightlyRate() * numberOfNights;
        return new Booking(bedroom, numberOfNights, bill);
    }

    public Set<String> getDiningRooms() {
        return this.diningRooms.keySet();
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        this.diningRooms.put(diningRoom.getName(), diningRoom);
    }

    public ArrayList<Bedroom> getEmptyBedrooms() {
        ArrayList<Bedroom> result;
        result = new ArrayList<Bedroom>();
        for (Bedroom bedroom : this.bedrooms) {
            if (bedroom.numberOfGuests() == 0) {
                result.add(bedroom);
            }
        } return result;
    }
}
