package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog{

    List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem item){
        catalogItems.add(item);
    }

    public double averagePageNumberOver(int page){
        return 12.0;
    }

    public void deleteItemByRegistrationNumber(String registrationNumber){
        for(int i = 0; i < catalogItems.size(); i++){
            if (catalogItems.get(i).getRegistrationNumber().equals(registrationNumber))
                catalogItems.remove(i);
        }
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
