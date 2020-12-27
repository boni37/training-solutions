package introinheritance;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Item> items = new ArrayList<>();

    public Basket() {
    }

    public Basket(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(String barcode){
        Item removed = null;
        for(Item item:items){
            if(item.getBarcode().equals(barcode)){
                removed = item;
            }
        }items.remove(removed);
    }

    public void clearBasket(){
        items.clear();
    }

    public List<Item> getItems() {
        return items;
    }
}
