package week11d02;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stringbuilder.PalindromeValidator;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {

    @BeforeAll
    public static void init(){
        Courier courier = new Courier();
        courier.addRide(new Ride(1,1,12));
        courier.addRide(new Ride(2,2,12));
    }

    @Test
    public void testWithRightRide(){
        Courier courier = new Courier();
        courier.addRide(new Ride(2,3,12));
        assertEquals(3,courier.getRides().size());
    }

    @Test
    public void notValidTransportNumber () throws IllegalArgumentException {
       Courier courier = new Courier();
       Exception ex = assertThrows(IllegalArgumentException.class, () -> courier.addRide(new Ride(2,1,12)));
       assertEquals("The Transport number is not valid.", ex.getMessage());
    }

    @Test
    public void dayHasGone () throws IllegalArgumentException {
       Courier courier = new Courier();
       Exception ex = assertThrows(IllegalArgumentException.class, () -> courier.addRide(new Ride(1,1,12)));
       assertEquals("This Day has gone.", ex.getMessage());
    }

    @Test
    public void dayNotValid () throws IllegalArgumentException {
       Courier courier = new Courier();
       Exception ex = assertThrows(IllegalArgumentException.class, () -> courier.addRide(new Ride(8,1,12)));
       assertEquals("The day is not valid.", ex.getMessage());
    }




}