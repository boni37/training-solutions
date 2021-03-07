package covid;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class GenerateTajFromFile {

    private List<PersonForVacination> personForVacinationList = new ArrayList<>();

    public String generateTajCode(String tajCode){
        int sum = Character.getNumericValue(tajCode.charAt(0))*3;
        for(int i = 1; i<8; i++){
            if(i%2!=0){
                sum += Character.getNumericValue(tajCode.charAt(i))*7;
            }else sum += Character.getNumericValue(tajCode.charAt(i))*3;
        }
        String taj = tajCode + sum%10;
        return taj;
    }

    private static void writeToFile(List<PersonForVacination> personForVacinationList){
        try(BufferedWriter writer = Files.newBufferedWriter(Path.of("src","main","resources","covid","ListWithValidTaj.csv"))){
            for(PersonForVacination person : personForVacinationList){
                writer.write(person.getName()+","+person.getZipCode()+","+person.getAge()+","+person.getEmailAddress()+","+person.getTajCode()+"\n");
            }
        } catch (IOException ioException) {
            throw new IllegalArgumentException("Can not write file",ioException);
        }
    }


    private static void readFromFile(List<PersonForVacination> personForVacinationList) {
        String line;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(GenerateTajFromFile.class.getResourceAsStream("listForVaccine.csv")))){
            while((line = reader.readLine())!= null){
                String[] fields = line.split(",");
                String name = fields[1];
                String zipCode = fields[2];
                int age= Integer.parseInt(fields[3]);
                String emailAddress= fields[4];
                String tajCode = new GenerateTajFromFile().generateTajCode(fields[5]);
                personForVacinationList.add(new PersonForVacination(name,zipCode,age,emailAddress,tajCode));
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not read file",ioException);
        }
    }

    public static void main(String[] args) {
        List<PersonForVacination> personForVacinationList = new ArrayList<>();
        readFromFile(personForVacinationList);
        writeToFile(personForVacinationList);

    }
}
