package week08d01;

import org.junit.jupiter.api.Test;
import schoolrecords.ClassRecords;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RobotTest {

    @Test
    public void moveRobotTest(){
        Robot robot = new Robot();
        assertEquals("xCoordinate= 5, yCoordinate= 2",robot.positionAfterMove("FFJJJJJ").toString());
    }

    @Test
    public void moveRobotTestWrong(){
        Robot robot = new Robot();
        Exception ex = assertThrows(IllegalArgumentException.class, () ->robot.positionAfterMove("FFJJJJJk").toString());
        assertEquals("This movement is not right!", ex.getMessage());

    }


}
