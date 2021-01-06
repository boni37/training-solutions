package exam02;

public class Skill {

    private String name;


    public Skill(String name, String level) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return name.substring(name.indexOf("("),name.length()-1);
    }
}
