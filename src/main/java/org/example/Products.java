package org.example;

public abstract class Products {
    public String name;
    public Double Price;

    public Products(String name, Double price) {
      this.name = name;
      this.Price = price;
    }

    public Double getPrice() {
        return Price;
    }

    public String getName() {
        return name;
    }
}
