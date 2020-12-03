package week06d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StoreTest {

    @Test
    public void countFrozen(){
        Store store = new Store(Arrays.asList(
        new Product("Milk", Category.DAIRY,11),
        new Product("Pork meat",Category.FROZEN,12),
        new Product("Beef meat",Category.FROZEN,12),
        new Product("Beer",Category.OTHER,12),
        new Product("Whole grain bread",Category.BAKEDGOODS,11)));

        assertEquals(2,store.getProductByCategoryName(Category.FROZEN));
    }
}
