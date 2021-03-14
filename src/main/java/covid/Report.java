package covid;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Report {

    public void generatedReportForVaccination() {
        Map<String, List<EntryForList>> vaccinationReport = new TreeMap<>();
        vaccinationReport = new CovidDao().generateMapFromData();
        System.out.println(vaccinationReport.toString());
    }
}
