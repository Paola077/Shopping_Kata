package org.example;

public class FoodProduct extends Products {
    double discount;

    public FoodProduct(String name, Double price) {
        super(name, price);
        this.name = name;
        this.discount = 0.0;
        this.Price = price;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public double applyDiscount() {
        this.discount = this.Price * 0.85;
        return discount;
    }
}


