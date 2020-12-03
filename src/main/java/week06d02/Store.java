package week06d02;

import java.util.ArrayList;
import java.util.List;

public class Store {

    public List<Product> products;

    public Store(List<Product> products) {
        this.products = products;
    }

    public int getProductByCategoryName(Category category){
        int count = 0;
        for(Product j:products){
            if(category.equals(j.getCategory())){
                count+=1;
            }
        }return  count;
    }

}
