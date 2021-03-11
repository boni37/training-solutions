package covid;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class GenerateFileByZipCode {

    public void generatedListForVaccination(String zipCode){
        String cityName = new CovidDao().existZipCode(zipCode);
        List<String> result = new CovidDao().generateListFromData(zipCode);
        List<String> listOfVaccinations = new ArrayList<>();
        LocalTime time = LocalTime.of(7,30);
        for(int i=0; i < result.size(); i++){
            time = time.plusMinutes(30);
            String line = time.toString()+"  "+result.get(i)+"\n";
            listOfVaccinations.add(line);
        }
        String filename = zipCode +"_"+cityName +"_" + LocalDate.now()+ ".txt";
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(filename))){
            for(String list:listOfVaccinations){
                writer.write(list);
            }
        } catch (IOException e) {
            throw new IllegalStateException("cannot write file");
        }
    }

}
