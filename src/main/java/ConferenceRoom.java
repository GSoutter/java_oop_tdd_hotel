import java.util.ArrayList;

public class ConferenceRoom {


    private String name;
    private int capacity;
    private String roomType;
    private ArrayList<Guest> guests;


    public ConferenceRoom(String name, int capacity, String roomType) {
        this.name = name;
        this.capacity = capacity;
        this.roomType = roomType;
        this.guests = new ArrayList<Guest>();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public int numberOfGuests() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest) {

        this.guests.remove(guest);
    }
}

