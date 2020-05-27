import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BookingTest {

    private Bedroom bedroom;
    private Booking booking;


    @Before
    public void setUp(){
        bedroom = new Bedroom(1, 2, "Double", 45.50);
        booking = new Booking(bedroom, 3, 100);
    }

    @Test
    public void hasRoom(){
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void hasNumberOfNights(){
        assertEquals(3, booking.getNumberOfNights());
    }

    @Test
    public void hasBill(){
        assertEquals(100, booking.getBill(), 0.1);
    }


}
