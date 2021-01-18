package week12.d01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GradeRounderTest {

    @Test
    public void gradeRoundTest(){
        int[] grades = new int[20];
        for(int i= 0; i< grades.length; i++){
            grades[i] = (int)(Math.random() * 100) + 1;
        }
        int[] gradesAfterRound =  new GradeRounder().roundGrades(grades);
        for(int i= 0; i< grades.length;i++){
            System.out.println("Original: "+ grades[i]+ "  After round:"+ gradesAfterRound[i]);
        }
    }

}