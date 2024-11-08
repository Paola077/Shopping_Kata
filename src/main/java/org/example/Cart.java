package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cart {

    private ArrayList<Products> cartList = new ArrayList<Products>();


    public void addFoodProduct(FoodProduct foodProduct) {
        for (Products products : cartList) {
            if(foodProduct.equals(foodProduct.getName())) {
                throw new IllegalArgumentException("This product alredy exist in the cart ");
            }
        }

       FoodProduct newFoodProduct1 = new FoodProduct("Pera",2.00);
        cartList.add(newFoodProduct1);
    }

    public ArrayList<Products> getAllProducts() {
        return this.cartList;
    }
}

