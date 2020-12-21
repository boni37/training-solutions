package classcatalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem implements Feature{

    public List<Feature> features = new ArrayList<>();
    private int price;
    private String registrationNumber;

    public CatalogItem(String registrationNumber, int price,List<Feature> features) {
        this.registrationNumber = registrationNumber;
        this.price = price;
        this.features = features;
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

    @Override
    public List<String> getContributors() {
        return null;
    }

    @Override
    public String getTitle() {
        return null;
    }
}
