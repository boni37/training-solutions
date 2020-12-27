package introinheritance;

public class ShoppingBasket {

    private Basket basket = new Basket();

    public ShoppingBasket() {
    }

    public ShoppingBasket(Basket basket) {
        this.basket = basket;
    }

    public void addItem(Item item){
        basket.addItem(item);
    }

    public void removeItem(String barcode){
        basket.removeItem(barcode);
    }

    public double sumNettoPrice(){
        double sumnettoPrice = 0;
        for(Item item : basket.getItems()){
            sumnettoPrice += item.getNettoPrice();
        }return sumnettoPrice;
    }

    public double sumTaxValue(){
        double sumtaxValue = 0;
        for(Item item : basket.getItems()){
            sumtaxValue += item.getTaxAmount();
        }return sumtaxValue;
    }

    public double sumBruttoPrice(){
        double sumbruttoPrice = 0;
        for(Item item : basket.getItems()){
            sumbruttoPrice += (item.getNettoPrice() + item.getTaxAmount());
        }return sumbruttoPrice;
    }

    public void checkout(){
        basket.clearBasket();
    }

    public void removeMostExpensiveItem(){

    }


}
