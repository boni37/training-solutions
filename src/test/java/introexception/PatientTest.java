package introexception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PatientTest {
    @Test
    public void invalidYearOfBirth() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Patient("John Doe", "abc", 1896));
        assertEquals("Year of birth must not be less than 1900!", ex.getMessage());
    }

    @Test
    public void invalidName() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Patient("", "abc", 2000));
        assertEquals("Name must not be empty!", ex.getMessage());
    }

    @Test
    public void validSsn() {
        Patient patient = new Patient("John Doe", "123456788", 2000);
        assertEquals("John Doe", patient.getName());
        assertEquals("123456788", patient.getSocialSecurityNumber());
        assertEquals(2000, patient.getYearOfBirth());
    }

}
