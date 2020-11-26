package week05d04;

import java.time.LocalDate;

public class Product {

    private String nameProduct;
    private LocalDate expirationDate;
    private int year, month, day;

    public String getNameProduct() {
        return nameProduct;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public Product(String nameProduct) {
        this.nameProduct = nameProduct;
    }

  public Product(String nameProduct, int year, int month, int day) {
        this.nameProduct = nameProduct;
        this.year = year;
        this.month = month;
        this.day = day;
        LocalDate expirationDate = LocalDate.of(this.year,this.month,this.day);
        this.expirationDate = expirationDate;
    }
}
