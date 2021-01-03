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
        int fulLenght = 0;
        for(Feature feature:features){
            fulLenght += AudioFeatures.getLength();
        }
        return fulLenght;
    }

    public List<String> getContributors() {
        return null;
    }

    public List<String> getTitles() {
        return getTitles();
    }

    public boolean hasAudioFeature(){
        for(int i=0; i< features.size(); i++){
            if(features.get(i).getContributors()!= null)return true;
        }
        return false;
    }

    public boolean hasPrintedFeature(){
        for(int i=0; i< features.size(); i++){
            if(features.get(i)!= null)return true;
        }
        return false;
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
