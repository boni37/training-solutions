package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GentlemanTest {

    @Test
    public void testHello(){

        Gentleman gentleman = new Gentleman();

        assertEquals("Hello John Doe",gentleman.sayHello("John Doe"));

    }

}