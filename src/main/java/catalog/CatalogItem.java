package catalog;

import java.util.ArrayList;
import java.util.List;


public class CatalogItem {

    public List<Feature> features;
    private int price;
    private String registrationNumber;

    public CatalogItem(String registrationNumber, int price, List<Feature> features) {
        this.registrationNumber = registrationNumber;
        this.price = price;
        this.features = features;
    }

    public int fullLengthAtOneItem(){
        return 12;
    }

    public List<String> getContributors() {
        return null;
    }

    public List<String> getTitles() {
        return getTitles();
    }

    public boolean hasAudioFeature(){
        return true;
    }

    public boolean hasPrintedFeature(){
        return true;
    }

    public int numberOfPagesAtOneItem(){
        return 2;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }






}
