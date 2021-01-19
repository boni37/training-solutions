package ioreaderclasspath;

public class Country {

    private String countryName;
    private int neighbourNumber;

    public Country(String countryName, int neighbourNumber) {
        this.countryName = countryName;
        this.neighbourNumber = neighbourNumber;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getNeighbourNumber() {
        return neighbourNumber;
    }
}
