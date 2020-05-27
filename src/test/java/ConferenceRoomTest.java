import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {


    private Guest guest;
    private ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        guest = new Guest("Dave");
        conferenceRoom = new ConferenceRoom("Carnegie", 2);

    }

    @Test
    public void hasName() {
        assertEquals("Carnegie", conferenceRoom.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, conferenceRoom.getCapacity());
    }

    @Test
    public void hasEmptyGuestArray() {
        assertEquals(0, conferenceRoom.numberOfGuests());
    }

    @Test
    public void canAddGuests() {
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.numberOfGuests());
    }

    @Test
    public void canRemoveGuests() {
        conferenceRoom.addGuest(guest);
        conferenceRoom.removeGuest(guest);
        assertEquals(0, conferenceRoom.numberOfGuests());
    }

    @Test
    public void cannotRemoveGuestsTheSame() {
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.removeGuest(guest);
        assertEquals(1, conferenceRoom.numberOfGuests());
    }


}
