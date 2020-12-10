package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LabTest {

    @Test
    public void constOneTest(){
        Lab lab = new Lab("JAVA alapok");
        assertEquals("JAVA alapok:false:null",lab.toString());
    }

    @Test
    public void constTwoTest(){
        Lab lab1 = new Lab("JAVA OOP",LocalDate.of(2020,12,10));
        assertEquals("JAVA OOP:true:2020-12-10",lab1.toString());
    }

    @Test
    public void methWithDate(){
        Lab lab2 = new Lab("JAVA");
        lab2.complete();
        assertEquals("JAVA:true:2020-12-10",lab2.toString());
    }

    @Test
    public void methWithoutDate(){
        Lab lab3 = new Lab("JAVA");
        lab3.complete(LocalDate.of(2020,12,7));
        assertEquals("JAVA:true:2020-12-07",lab3.toString());
    }


}
