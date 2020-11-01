package classstuctureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Product name?");
        String name = scanner.nextLine();
        System.out.println("Product price?");
        Integer price = scanner.nextInt();
        Product product = new Product(name, price);
        System.out.println(product.getName()+":"+product.getPrice()+"Ft");
        product.increasePrice(50);
        System.out.println(product.getName()+":"+product.getPrice()+"Ft");
        product.decreasePrice(30);
        System.out.println(product.getName()+":"+product.getPrice()+"Ft");
    }


}
