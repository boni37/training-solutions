package ioreadwritebytes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturesWriterTest {

    private byte[] data = new byte[365];
    private Temperatures temperatures;

    @BeforeEach
    public void loadTemperatureToData(){
        Random random = new Random(5);
        random.nextBytes(data);
        temperatures = new Temperatures(data);
    }

    @Test
    public void testWriteTemperatures(){
        Path file = Path.of("src","main","resources","temperature_2021.txt");
        TemperaturesWriter temperaturesWriter = new TemperaturesWriter();
        temperaturesWriter.writeTemperatures(temperatures,file.toString());

        assertTrue(Files.exists(file));
        try {
            byte[] bytesInFile = Files.readAllBytes(file);
            assertArrayEquals(data,bytesInFile);
        } catch (IOException e) {
            throw new IllegalStateException("File not found",e);
        }
    }

}