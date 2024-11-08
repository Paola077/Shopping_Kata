package org.example;

public class FreeProduct extends Products {

    public FreeProduct(String name, Double price) {
        super(name, price);
        this.Price = 0.0;
    }

    @Override
    public Double getPrice() {
        return super.getPrice();
    }

}
