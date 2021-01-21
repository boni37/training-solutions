package iofiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class Installer {

    private static final String SOURCE_DIRECTORY = "/install/";

    public void install(String targetDirectory){
        Path target = Path.of(targetDirectory);
        if (!Files.exists(target) || !Files.isDirectory(target)) {
            throw new IllegalArgumentException("The given directory doesn't exist");
        }

        String rootOfInstall=targetDirectory+"/";
        List<String> installElements = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Installer.class.getResourceAsStream("/install/install.txt")))){
            String line;
            while((line = reader.readLine())!=null){
                installElements.add(line);
            }
            for(String actual: installElements){
                if(actual.endsWith("/")){
                    Path dir = Path.of(rootOfInstall+actual.substring(0,actual.length()-1));
                    Files.createDirectories(dir);
                }
            }
            for(String actual: installElements){
                if(!actual.endsWith("/")){
                    Files.copy(Installer.class.getResourceAsStream(SOURCE_DIRECTORY+actual),target.resolve(actual), StandardCopyOption.REPLACE_EXISTING);
                }
            }


        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.",ioe);
        }

    }
}
