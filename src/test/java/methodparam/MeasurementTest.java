package methodparam;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

    @Test
    public void addTest(){
        List<Double> measuredValues = Arrays.asList(2.3,3.4,5.6,7.9,3.5);
        Measurement measurement = new Measurement(measuredValues);
        assertEquals(1,measurement.findFirstIndexInLimit(5,3));
    }

    @Test
    public void minimumTest(){
        List<Double> measuredValues = Arrays.asList(2.3,3.4,5.6,7.9,1.5);
        Measurement measurement = new Measurement(measuredValues);
        assertEquals(1.5,measurement.minimum());
    }

    @Test
    public void maximumTest(){
        List<Double> measuredValues = Arrays.asList(2.3,3.4,5.6,7.9,1.5);
        Measurement measurement = new Measurement(measuredValues);
        assertEquals(7.9,measurement.maximum());
    }

    @Test
    public void minmaxTest(){
        List<Double> measuredValues = Arrays.asList(2.3,3.4,5.6,7.9,1.5);
        Measurement measurement = new Measurement(measuredValues);
        assertEquals(7.9,measurement.minmax().getMax());
        assertEquals(1.5,measurement.minmax().getMin());
    }

}