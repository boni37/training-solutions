package week14d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class DoNotDeliveredItems {

    public List<OrderedList> readFile(Path file){
        List<OrderedList> orderedLists = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(file)){
            String line;
            while((line=reader.readLine())!=null){
                String[] boughtItems = line.split(" ");
                String orderID = boughtItems[0];
                String orderedItems = boughtItems[1];
                orderedLists.add(new OrderedList(orderID,orderedItems));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.",ioe);
        }return orderedLists;
    }

    public Map<String,List<String>> createMapList(List<OrderedList> orderedLists){
        Map<String,List<String>> mapOrdersNotDelivered = new TreeMap<>();
        for(OrderedList actual:orderedLists){
            String key = actual.getOrderID();
            List<String> values = Arrays.asList(actual.getItems().split(","));
            Collections.sort(values);
            mapOrdersNotDelivered.put(key,values);
        }return mapOrdersNotDelivered;
    }

    public void searchByOrderID(Map<String,List<String>> notDelivered,String orderID){
        for(Map.Entry m :notDelivered.entrySet()){
            if(m.getKey().equals(orderID)){
                System.out.println(m.getKey()+ ":"+ m.getValue());
            }
        }
    }

    public void countsItemByOrderID(Map<String,List<String>> notDelivered,String orderID){
        for(Map.Entry m :notDelivered.entrySet()){
            if(m.getKey().equals(orderID)){
                String[] result = m.getValue().toString().split(",");
                System.out.println(result.length);
            }
        }
    }



    public static void main(String[] args) {
        Path file = Path.of("shoppingList.txt");
        DoNotDeliveredItems doNotDeliveredItems = new DoNotDeliveredItems();
        List<OrderedList> readItems = doNotDeliveredItems.readFile(file);
        Map<String,List<String>> mapItems = doNotDeliveredItems.createMapList(readItems);
        doNotDeliveredItems.searchByOrderID(mapItems,"A233");
        doNotDeliveredItems.countsItemByOrderID(mapItems,"A233");
    }
}
