package iodatastream.statistics;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class HeightStatistics {

    public void saveHeights(List<Integer> heights, Path file){
        try (DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(file)))){
            outputStream.writeInt(heights.size());
            for(Integer actual: heights){
                outputStream.writeInt(actual);
            }

        } catch (IOException ioe) {
           throw new IllegalStateException("Can not write file",ioe);
        }
    }
}
