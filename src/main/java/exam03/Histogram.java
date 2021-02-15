package exam03;

import java.io.BufferedReader;
import java.io.IOException;

public class Histogram {

    public String  createHistogram(BufferedReader reader) throws IOException {
           String line;
           StringBuilder sb = new StringBuilder();
           while ((line = reader.readLine()) != null){
                int count= Integer.parseInt(line);
                for(int i=0; i< count;i++){
                    sb.append("*");
                }
                sb.append('\n');
           }
           return sb.toString();
    }

}
