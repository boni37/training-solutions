package covid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MassRegistration {

    public void readFromFile(String fileName){
        List<PersonForVacination> persons = new ArrayList<>();
        String line;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(MassRegistration.class.getResourceAsStream(fileName)))){
            while((line = reader.readLine())!= null){
                String[] fields = line.split(",");
                String name = fields[0];
                String zipCode = fields[1];
                int age= Integer.parseInt(fields[2]);
                String emailAddress= fields[3];
                String tajCode = fields[4];
                persons.add(new PersonForVacination(name,zipCode,age,emailAddress,tajCode));
            }new CovidDao().writeListToDatabase(persons);
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not read file",ioException);
        }
    }

    public void readFileName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add filename :");
        String fileName = scanner.nextLine();
        new MassRegistration().readFromFile(fileName);
    }
}
