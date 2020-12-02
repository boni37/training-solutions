package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordEraserTest {

    @Test
    public void EraserTest(){
        WordEraser wordEraser = new WordEraser();
        String words = "So I say Thank you for the music the songs For giving it to me";
        assertEquals("SoIsayThankyouthemusicthesongsgivingittome",wordEraser.eraseWord(words,"for"));
    }
}
