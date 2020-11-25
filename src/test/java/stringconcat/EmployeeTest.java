package stringconcat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    @Test
    public void testCreate(){
        Employee employee = new Employee("Nagy Gábor", "esztergályos",25000);

        assertEquals(("Nagy Gábor"),employee.getName());
        assertEquals("esztergályos",employee.getJob());
        assertEquals(25000,employee.getSalary());
    }

    @Test
    public void testCreateWithEmptyName(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Employee("","esztergályos",25000));
        assertEquals("Name must not empty.",ex.getMessage());
    }

    @Test
    public void testCreateWithNullJob(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Employee("Kiss Antal",null,25000));
        assertEquals("Job must not empty.",ex.getMessage());
    }

    @Test
    public void testWithNonDividedThousand(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Employee("Kovacs Lajos","esztergályos",23123));
        assertEquals("Salary must be divide thousand.", ex.getMessage());

    }

    @Test
    public void testToString(){
        Employee employee = new Employee("Takács Tamás","váltóőr",12000);

        assertEquals("Takács Tamás - váltóőr - 12000 Ft", employee.toString());
    }



}
