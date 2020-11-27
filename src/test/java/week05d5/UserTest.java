package week05d5;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {

    @Test
    public void testCreateUserWithWrongEmail(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new User("John","Doe","john_doe@albacom"));
        assertEquals("E-mail does not contain @ and .",ex.getMessage());
    }

}
