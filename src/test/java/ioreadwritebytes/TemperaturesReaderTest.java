package ioreadwritebytes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturesReaderTest {

    private byte[] data = new byte[365];
    private Temperatures temperatures;

    @BeforeEach
    public void loadTemperatureToData(){
        Random random = new Random(5);
        random.nextBytes(data);
        temperatures = new Temperatures(data);
    }

    @Test
    public void testReadTemperatures() {
        Path file = Path.of("src", "main", "resources", "temperature_2021.txt");
        TemperaturesReader temperaturesReader = new TemperaturesReader();
        temperaturesReader.readTemperatures(file);

        assertTrue(Files.exists(file));

    }
}