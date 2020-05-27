import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Guest guest;
    private ConferenceRoom conferenceRoom;
    private Bedroom bedroom;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    private Hotel hotel;

    @Before
    public void before(){
        guest = new Guest("Dave");
        conferenceRoom = new ConferenceRoom("Carnegie", 4, "Double");
        bedroom = new Bedroom(1, 2, "Double");


        bedrooms = new ArrayList<Bedroom>();
        conferenceRooms = new ArrayList<ConferenceRoom>();
        bedrooms.add(bedroom);
        conferenceRooms.add(conferenceRoom);

        hotel = new Hotel(bedrooms, conferenceRooms);
    }

    @Test
    public void hasBedrooms() {
        assertEquals(1, hotel.numberOfBedrooms());
    }

    @Test
    public void hasConferenceRooms() {
        assertEquals(1, hotel.numberOfConferenceRooms());
    }

    @Test
    public void canCheckInBedrooms() {
        hotel.checkInGuestBedroom(bedroom, guest);
        assertEquals(1, bedroom.numberOfGuests());
    }


    @Test
    public void canCheckInConferenceRoom() {
        hotel.checkInGuestConferenceRoom(conferenceRoom, guest);
        assertEquals(1, conferenceRoom.numberOfGuests());
    }


}
