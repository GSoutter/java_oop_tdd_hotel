import java.util.ArrayList;

public class DiningRoom {


    private String name;
    private int capacity;
    private ArrayList<Guest> guests;


    public DiningRoom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
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


