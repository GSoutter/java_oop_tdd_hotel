import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {


    private Guest guest;
    private DiningRoom diningRoom;

    @Before
    public void before(){
        guest = new Guest("Dave");
        diningRoom = new DiningRoom("Maddison", 2);

    }

    @Test
    public void hasName() {
        assertEquals("Maddison", diningRoom.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, diningRoom.getCapacity());
    }

    @Test
    public void hasEmptyGuestArray() {
        assertEquals(0, diningRoom.numberOfGuests());
    }

    @Test
    public void canAddGuests() {
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.numberOfGuests());
    }

    @Test
    public void canRemoveGuests() {
        diningRoom.addGuest(guest);
        diningRoom.removeGuest(guest);
        assertEquals(0, diningRoom.numberOfGuests());
    }

    @Test
    public void cannotRemoveGuestsTheSame() {
        diningRoom.addGuest(guest);
        diningRoom.addGuest(guest);
        diningRoom.removeGuest(guest);
        assertEquals(1, diningRoom.numberOfGuests());
    }


}

