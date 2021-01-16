package ioreadwritebytes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturesTest {

    public byte[] data = new byte[365];

    @BeforeEach
    public void loadTemperatureToData(){
        Random random = new Random(5);
        random.nextBytes(data);
    }

    @Test
    public void testGetAverageYear(){
        Temperatures temperatures = new Temperatures(data);
        double average = temperatures.getYearAverage();
        assertEquals(3.778, average, 0.0001);
    }

    @Test
    public void testGetMontAverage(){
        Temperatures temperatures = new Temperatures(data);
        double average = temperatures.getMonthAverage();
        assertEquals(10.2, average, 0.0001);
    }

}