package week13d01;

public class City {

    private String IRSZ;
    private String telepules;
    private String telepulesresz;

    public City(String IRSZ, String telepules, String telepulesresz) {
        this.IRSZ = IRSZ;
        this.telepules = telepules;
        this.telepulesresz = telepulesresz;
    }

    public String getIRSZ() {
        return IRSZ;
    }

    public String getTelepules() {
        return telepules;
    }

    public String getTelepulesresz() {
        return telepulesresz;
    }
}
