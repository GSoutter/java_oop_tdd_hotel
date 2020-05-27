import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {


    private Guest guest;
    private Bedroom bedroom;

    @Before
    public void before(){
        guest = new Guest("Dave");
        bedroom = new Bedroom(1, 2, "Double", 45.50);

    }

    @Test
    public void hasNumber() {
        assertEquals(1, bedroom.getNumber());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasRoomType() {
        assertEquals("Double", bedroom.getRoomType());
    }

    @Test
    public void hasEmptyGuestArray() {
        assertEquals(0, bedroom.numberOfGuests());
    }

    @Test
    public void canAddGuests() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.numberOfGuests());
    }

    @Test
    public void canRemoveGuests() {
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.numberOfGuests());
    }

    @Test
    public void cannotRemoveGuestsTheSame() {
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(1, bedroom.numberOfGuests());
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(45.50, bedroom.getNightlyRate(), 0.1);
    }


}
