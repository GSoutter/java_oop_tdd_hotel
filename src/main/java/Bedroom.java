import java.util.ArrayList;

public class Bedroom {


    private int number;
    private int capacity;
    private String roomType;
    private ArrayList<Guest> guests;
    private double nightlyRate;



    public Bedroom(int number, int capacity, String roomType, double nightlyRate) {
        this.number = number;
        this.capacity = capacity;
        this.roomType = roomType;
        this.guests = new ArrayList<Guest>();
        this.nightlyRate = nightlyRate;
    }


    public int getNumber() {
        return this.number;
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

    public double getNightlyRate() {
        return nightlyRate;
    }


}


