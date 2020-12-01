package week06d02;

import java.util.ArrayList;
import java.util.List;

public class Store {

    public List<Product> products = new ArrayList<>();
    Store store = new Store();

    public List<Product> addProduct(){
        products.add(new Product("Milk", Category.DAIRY.toString(),11));
        products.add(new Product("Pork meat",Category.FROZEN.toString(),12));
        products.add(new Product("Beef meat",Category.FROZEN.toString(),12));
        products.add(new Product("Beer",Category.OTHER.toString(),12));
        products.add(new Product("Whole grain bread",Category.BAKEDGOODS.toString(),11));
        return products;
    }

    public int getProductByCategoryName(Category category){
        store.addProduct();
        int count = 0;
        for(Product j:products){
            if(category.equals(j.getCategory())){
                count+=1;
            }
        }return  count;
    }

}
