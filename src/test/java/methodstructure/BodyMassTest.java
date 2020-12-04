package methodstructure;

import org.junit.jupiter.api.Test;
import week06d02.Category;


import static org.junit.jupiter.api.Assertions.*;

public class BodyMassTest {

    @Test
    public void compareBodies(){
        BodyMass bodyMass1 = new BodyMass(75.3,1.82);
        BodyMass bodyMass2 = new BodyMass(70.3,1.82);

        assertTrue(bodyMass2.isThinner(bodyMass1));
    }

    @Test
    public void bodyStatus(){
        BodyMass bodyMass = new BodyMass(50.2,1.8);
        assertEquals(BmiCategory.UNDERWEIGHT,bodyMass.body());
    }
}
