package classstructureconstructors;

public class Store {
    private String product;
    private Integer stock;

    public Store(String product) {
        this.product = product;
        stock = 0;
    }

    public String getProduct() {
        return product;
    }

    public Integer getStock() {
        return stock;
    }

    public void store(int db){
        stock = stock + db;
    }

    public void dispatch(int db){
        stock = stock - db;
    }
}
