package week06d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StoreTest {

    @Test
    public void countFrozen(){
        Store store = new Store();
        store.addProduct();
        assertEquals(2,store.getProductByCategoryName(Category.FROZEN));
    }
}
