package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cart {

   public Cart(){}

    private ArrayList<Products> cartList = new ArrayList<>();


    public void addFoodProduct(FoodProduct foodProduct) {
        if (cartList.contains(foodProduct)) {
            throw new IllegalArgumentException("This product alredy exist in the cart ");
        }

        cartList.add(foodProduct);
    }

    public ArrayList<Products> getAllProducts() {
        return this.cartList;
    }
}

//Añadir un count de productos
