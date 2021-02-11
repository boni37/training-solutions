package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class CovidCaseReport{

    private String week;
    private int caseNum;



    public CovidCaseReport(String week, int caseNum) {
        this.week = week;
        this.caseNum = caseNum;
    }

    public static void main(String[] args) {
        Path file = Path.of("data.csv");
//        Map<String,Integer> mapOfCases = new TreeMap<>();
        List<CovidCaseReport> reports = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(file)){
            String line;
            while((line= reader.readLine())!=null){
                if(line.contains("Hungary")){
                    String[] dataOfReport = line.split(",");
                    String keyMapOfCases = dataOfReport[1];
                    int valueMapOfCases = Integer.parseInt(dataOfReport[2]);
                    reports.add(new CovidCaseReport(keyMapOfCases,valueMapOfCases));
                }
            }
            Collections.sort(reports, new Comparator<>() {
                @Override
                public int compare(CovidCaseReport o1, CovidCaseReport o2) {
                    return -(o1.caseNum-o2.caseNum);
                }
            });

            for(int i=0; i< 3; i++){
                System.out.println("The most cases was in: "+reports.get(i).week +" week. Cases number was: "+ reports.get(i).caseNum);
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file",ioe);
        }
    }

}
