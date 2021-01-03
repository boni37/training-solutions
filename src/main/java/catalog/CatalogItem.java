package catalog;

import java.util.ArrayList;
import java.util.List;


public class CatalogItem {

    public List<Feature> features = new ArrayList<>();
    private int price;
    private String registrationNumber;

    public CatalogItem(String registrationNumber, int price, Feature... feature) {
        this.registrationNumber = registrationNumber;
        this.price = price;
        for(Feature actual:feature){
            features.add(actual);
        }
    }

    public int fullLengthAtOneItem(){

        return AudioFeatures.getLength();
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
        return PrintedFeatures.getNumberOfPages();
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
