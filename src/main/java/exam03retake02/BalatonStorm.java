package exam03retake02;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BalatonStorm {

    private List<String> result = new ArrayList<>();

    public List<String> getStationsInStorm(BufferedReader reader) throws IOException {
        List<String> result = new ArrayList<>();
        List<String> stormPossible = new ArrayList<>();
        String line;
        while((line= reader.readLine())!=null){
            if(!line.contains("[")&!line.contains("]")&!line.contains("{")&!line.contains("}")){
                line = line.replaceAll("\"","");
                result.add(line.trim());
            }
        }
        for(int i=0; i< result.size();i++){
            if(result.get(i).contains("level: 3")){
                String city = result.get(i-4);
                stormPossible.add(city.substring(9,city.length()-1));
            }
        }
        Collections.sort(stormPossible, Collator.getInstance());
        return stormPossible;
    }

}
