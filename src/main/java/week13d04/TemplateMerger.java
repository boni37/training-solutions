package week13d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TemplateMerger {

    private List<Employee> employees = new ArrayList<>();

    public TemplateMerger() {
    }

    public TemplateMerger(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String merge(Path file, List<Employee> employees){
        try {
            List<String> reader = Files.readAllLines(file);
            for(String actual:reader){
                String[] s= actual.split(",");
                String name = s[0].substring(20);
                int year = Integer.parseInt(s[1].substring(16));
                employees.add(new Employee(name,year));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        } return employees.toString();
    }

    public static void main(String[] args) {
        Path file=Path.of("employees.txt");
        List<Employee> employees = new ArrayList<>();
        System.out.println(new TemplateMerger().merge(file,employees));
    }
}
