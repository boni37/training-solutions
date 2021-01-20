package ioconvert.shopping;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingListManager {

    public void saveShoppingList(OutputStream os, List<String> products){
        try (PrintStream shoppings = new PrintStream(new BufferedOutputStream(os))){
            for(String actual: products){
                shoppings.println(actual);
            }
        }
    }


    public List<String> loadShoppingList(InputStream is){
        List<String> shoppingList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = bufferedReader.readLine()) != null){
                shoppingList.add(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file",ioe);
        }return shoppingList;

    }
}
