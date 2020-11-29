package filescanner;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class BucketList {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Path.of("bucketlist.txt"))){
            while(scanner.hasNextLine()){
                String s = scanner.nextLine();
                System.out.println(s);
            }

        }
        catch (IOException ioe){
            throw new IllegalStateException("Cannot read file",ioe);
        }

    }
}
