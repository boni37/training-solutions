package week14d02;

public class OrderedList {

    private String orderID;
    private String items;

    public OrderedList(String orderID, String items) {
        this.orderID = orderID;
        this.items = items;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "orderID= " + orderID + " items= " + items + '\n';
    }
}
