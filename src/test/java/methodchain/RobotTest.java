package methodchain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotTest {

    private Robot robot;

    @BeforeEach
    public void setUp() {
        this.robot = new Robot();
    }

    @AfterEach
    public void tearDown() {
        this.robot = null;
    }

    @Test
    public void testGoAndRotate() {
        //When
        robot.go(5).go(10).rotate(30);
        //Then
        assertEquals(15, robot.getDistance());
        assertEquals(30, robot.getAzimut());
    }

    @Test
    public void testRotate() {
        //When
        robot.rotate(45).rotate(45).rotate(-90);
        //Then
        assertEquals(0, robot.getAzimut());
    }

}
