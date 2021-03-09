package covid;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class GenerateFileByZipCode {

    public List<String> generatedListForVaccination(String zipCode){
        List<String> result = new CovidDao().generateListFromData(zipCode);
        List<String> listOfVaccinations = new ArrayList<>();
        LocalTime time = LocalTime.of(7,30);
        for(int i=0; i < result.size(); i++){
            time = time.plusMinutes(30);
            String line = time.toString()+"  "+result.get(i);
            listOfVaccinations.add(line);
        }return listOfVaccinations;
    }

}
