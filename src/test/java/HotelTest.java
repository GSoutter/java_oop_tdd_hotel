import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Guest guest;
    private ConferenceRoom conferenceRoom;
    private Bedroom bedroom;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Bedroom> bedrooms2;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private DiningRoom diningRoom;


    private Hotel hotel;
    private Hotel hotel2;


    @Before
    public void before(){
        guest = new Guest("Dave");
        conferenceRoom = new ConferenceRoom("Carnegie", 4);
        bedroom = new Bedroom(1, 2, "Double", 45.50);
        bedroom2 = new Bedroom(2, 2, "Double", 45.50);
        bedroom3 = new Bedroom(3, 3, "Double", 45.50);
        diningRoom = new DiningRoom("Maddison", 2);


        bedrooms = new ArrayList<Bedroom>();
        bedrooms2 = new ArrayList<Bedroom>();
        conferenceRooms = new ArrayList<ConferenceRoom>();
        bedrooms.add(bedroom);
        conferenceRooms.add(conferenceRoom);

        bedrooms2.add(bedroom);
        bedrooms2.add(bedroom2);
        bedrooms2.add(bedroom3);

        hotel = new Hotel(bedrooms, conferenceRooms);
        hotel2 = new Hotel(bedrooms2, conferenceRooms);
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
    public void wontCheckInBedroomsIfItsNotEmpty(){
        hotel.checkInGuestBedroom(bedroom, guest);
        hotel.checkInGuestBedroom(bedroom, guest);
        assertEquals(1, bedroom.numberOfGuests());
    }


    @Test
    public void canCheckInConferenceRoom() {
        hotel.checkInGuestConferenceRoom(conferenceRoom, guest);
        assertEquals(1, conferenceRoom.numberOfGuests());
    }

    @Test
    public void canMakeABooking(){
        Booking booking = hotel.bookBedroom(bedroom, 2);
        assertEquals(91, booking.getBill(), 0.1);
    }

    @Test
    public void hasEmptyDiningRoomHashMap(){
        Set<String> result = hotel.getDiningRooms();
        assertEquals(0, result.size());
    }

    @Test
    public void canAddDiningRoomToHashMap(){
        hotel.addDiningRoom(diningRoom);
        Set<String> result = hotel.getDiningRooms();
        assertEquals(1, result.size());
    }

    @Test
    public void canReturnOnlyEmptyBedroom(){
        hotel2.checkInGuestBedroom(bedroom, guest);
        hotel2.checkInGuestBedroom(bedroom3, guest);
        ArrayList<Bedroom> result = hotel2.getEmptyBedrooms();
        System.out.println(result);
        assertEquals(1, result.size());

    }






}
