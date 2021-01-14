package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FilesSum {

    public static Integer sumNumbers(){
        int numSum = 0;
        for(int i = 0; i< 100; i++) {
            String fileName = "number"+i +".txt";
            Path file = Path.of(fileName);
            boolean is_regular = Files.isRegularFile(file, LinkOption.NOFOLLOW_LINKS);
            if(is_regular){
                try {
                    String number = Files.readString(file);
                    numSum += Integer.parseInt(number);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }continue;
        } return numSum;
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers());
    }
}
