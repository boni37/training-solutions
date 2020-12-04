package defaultconstructor;

import dafaultconstructor.SimpleDate;
import org.junit.jupiter.api.Test;
import week05d5.User;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SimpleDateTest {

    @Test
    public void rightDate(){
        SimpleDate simpleDate = new SimpleDate();
        simpleDate.setDate(2015,12,31);
        assertEquals(2015,simpleDate.getYear());
        assertEquals(12,simpleDate.getMonth());
        assertEquals(31,simpleDate.getDay());
    }

    @Test
    public void leapYear(){
        SimpleDate simpleDate = new SimpleDate();
        simpleDate.setDate(2016,2,29);
        assertEquals(2016,simpleDate.getYear());
        assertEquals(2,simpleDate.getMonth());
        assertEquals(29,simpleDate.getDay());
    }

    @Test
    public void wrongYear(){
        SimpleDate simpleDate = new SimpleDate();
        Exception ex = assertThrows(IllegalArgumentException.class, () -> simpleDate.setDate(1816,2,29));
        assertEquals("Year or month is not valid!",ex.getMessage());
    }

    @Test
    public void wrongDay(){
        SimpleDate simpleDate = new SimpleDate();
        Exception ex = assertThrows(IllegalArgumentException.class, () -> simpleDate.setDate(2017,2,29));
        assertEquals("Day is not valid!",ex.getMessage());
    }





}
