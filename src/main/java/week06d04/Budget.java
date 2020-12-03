package week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    public List<Item> items;


    public void getItemsByMonth(int month){
        List<Item> items = new ArrayList<>();
        items.add(new Item(823,8,"Borotvahab"));
        items.add(new Item(28000,10,"BKV bérlet"));
        items.add(new Item(28000,11,"BKV bérlet"));
        items.add(new Item(4500,11,"Internet dij"));
        items.add(new Item(6400,11,"Telefon számla"));
        items.add(new Item(5321,7,"Csatorna dij"));
        items.add(new Item(5321,11,"Csatorna dij"));
        items.add(new Item(5321,9,"Csatorna dij"));
        for(Item z: items){
            if (month == z.getMonth()){
                System.out.println(z.getName()+","+z.getPrice()+" Ft.");
            }
        }
    }

    public static void main(String[] args) {
        Budget budget = new Budget();
        budget.getItemsByMonth(11);
    }
}
