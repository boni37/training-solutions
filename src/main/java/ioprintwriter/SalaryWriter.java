package ioprintwriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SalaryWriter {

    private List<String> names = new ArrayList<>();

    public SalaryWriter(List<String> names) {
        this.names = names;
    }

    public List<String> getNames() {
        return names;
    }

    public void writeNamesAndSalaries(Path file){
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(file))){
            for(String name : names){
                if(name.contains("Dr")){
                    writer.print(name+": ");
                    writer.println(500_000);
                }else if(name.contains("Mr")|| name.contains("Mrs")){
                    writer.print(name+": ");
                    writer.println(200_000);
                }else
                    { writer.print(name+": ");
                      writer.println(100_000);
                }
            }
        }
        catch (IOException e) {
            throw   new IllegalStateException("Can not open file.",e);
        }
    }
}
