package exam02;
//Egy önéletrajzot reprezentáló osztályt kell létrehozni, melyben van egy név, valamint skillek
// (hogy mihez ért az illető). A skill egy névvel és egy számmal (szint) rendelkezik, utóbbi 1 - 5 között.
// Az önéletrajz a Cv osztály pár metódussal, a skill a Skill osztály.A skillek megadása a nevével,
// valamint a szintjével történik, pl. programming (5).A findSkillLevelByName() a skill neve alapján visszaadja annak szintjét.


import java.util.ArrayList;
import java.util.List;

public class Cv{

    private String name;
    private List<Skill> skills;

    public Cv(String name) {
        this.name = name;
    }

    public Cv(String name, List<Skill> skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

   /* public void addSkills(String... skill){
        for(String actual :skills){
            skills.add(actual);
        }
    }*/
}
