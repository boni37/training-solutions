package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {
        Performance performance = new Performance("Kispál és a Borz", LocalDate.of(2020,11,24), LocalTime.of(12,00),LocalTime.of(15,30));
        System.out.println(performance.getInfo());
    }
}
