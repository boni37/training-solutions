package methoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    public void timeWithThreeArgsTest(){
        Time time = new Time(12,23,44);
        assertEquals(12, time.getHours());
        assertEquals(23, time.getMinutes());
        assertEquals(44, time.getSeconds());
    }

    @Test
    public void timeWithTwoArgsTest(){
        Time time = new Time(12,23);
        assertEquals(12, time.getHours());
        assertEquals(23, time.getMinutes());
        assertEquals(0, time.getSeconds());
    }

    @Test
    public void timeWithTimeTest(){
        Time othertime = new Time(12,23);
        Time time = new Time(othertime);
        assertEquals(12, time.getHours());
        assertEquals(23, time.getMinutes());
        assertEquals(0, time.getSeconds());
    }

    @Test
    public void isEqualWithThreeArgsTest(){
        Time time = new Time(15,43,22);
        assertTrue(time.isEqual(15,43,22));
    }

    @Test
    public void isEarlierWithThreeArgsTest(){
        Time time = new Time(12,15,33);
        assertTrue(time.isEarlier(11,15,33));
    }

}