package collectionsmap;

import java.time.LocalDate;
import java.util.*;

public class LogParser {

    static final int NUMBER_ELEMENTS = 3;
    static final String FIELD_SEPARATOR = ":";
    static final String DATE_SEPARATOR = "-";

    public Map<String, List<Entry>> parseLog(String log){
        Scanner scanner = new Scanner(log);
        Map<String, List<Entry>> logNote = new HashMap<>();
        String line2 = null;
        while(scanner.hasNext()){
          String[]  line = scanner.nextLine().split(FIELD_SEPARATOR);
          if(line.length!=NUMBER_ELEMENTS)throw new IllegalArgumentException("Incorrect log: incorrect number of fields");
          else{
              String ipAddress = line[0];
              String[] dateField = line[1].split(DATE_SEPARATOR);
              if(dateField.length!=NUMBER_ELEMENTS) throw new IllegalArgumentException("Incorrect log: incorrect date");
              else {
                  int year = Integer.parseInt(dateField[0]);
                  int month = Integer.parseInt(dateField[1]);
                  int day = Integer.parseInt(dateField[2]);
                  LocalDate date = LocalDate.of(year, month, day);
                  String login = line[2];
                  Entry entry = new Entry(ipAddress,date,login);
                  if(!logNote.containsKey(ipAddress)){
                      logNote.put(ipAddress,new ArrayList<>());
                  }logNote.get(ipAddress).add(entry);

              }
          }
        }return logNote;
    }


}
