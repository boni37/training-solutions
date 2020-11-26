package week05d04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {
    public List<Product> products;

    public List<Product> addProduct(List<Product> products){
        products.add(new Product("Milk",2020,11,30));
        products.add(new Product("Pork can",2020,12,30));
        products.add(new Product("Beef can",2020,12,21));
        products.add(new Product("Beer",2020,12,21));
        products.add(new Product("Whole grain bread",2020,11,21));
        return products;
    }

    public int getNumberOfExpired(List<Product> products){
        int numberExpiredProduct = 0;
        for (Product product:products){
            if (product.getExpirationDate().isBefore(LocalDate.now())){
                numberExpiredProduct += 1;
            }
        }
        return numberExpiredProduct;
    }

    public static void main(String[] args) {
        Store store = new Store();
        List<Product> products = new ArrayList<>();
        store.addProduct(products);
        System.out.println(store.getNumberOfExpired(products));

    }
}
