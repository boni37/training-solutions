package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    List<CatalogItem> catalogItems = new ArrayList<>();

    public void additem(CatalogItem item){

    }

    public double averagePageNumber(int page){
        return 12.0;
    }

    public void deleteItemByRegistrationNumber(String registrationNumber){

    }

    public List<CatalogItem> findByCriteria(SearchCriteria criteria){
        return catalogItems;
    }

    public int getAllPageNumber(){
        return 5;
    }

    public List<CatalogItem> getAudioLibraryItems(){
        return catalogItems;
    }

    public int getFullLength(){
        return 100;
    }

    public List<CatalogItem> getPrintedLibraryItems(){
        return catalogItems;
    }
}
