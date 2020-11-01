package classstuctureintegrate;

public class Product {
    private String name;
    private Integer price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public Integer getPrice() {
        return price;
    }
    public void increasePrice(int plus){
        price = price + plus;
    }
    public void decreasePrice(int minus){
        price = price - minus;
    }

}
