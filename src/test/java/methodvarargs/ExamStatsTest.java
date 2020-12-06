package methodvarargs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExamStatsTest {

    @Test
    public void topGradesTest(){
        ExamStats examStats = new ExamStats(100);
        int num= examStats.getNumberOfTopGrades(80,33,87,67,95,65);
        assertEquals(2,num);
    }

    @Test
    public void failedTest(){
        ExamStats examStats = new ExamStats(100);
        assertTrue(examStats.hasAnyFailed(60,33,87,67,95,65));
        assertFalse(examStats.hasAnyFailed(60,62,87,67,95,65));

    }
}
