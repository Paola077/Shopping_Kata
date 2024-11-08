import org.example.Cart;
import org.example.FoodProduct;
import org.example.Products;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest {

    @Test
    void WhenAddAProductToTheCartTheProductCannotBeRepeated() {
        Cart cart = new Cart();

        FoodProduct foodProduct1 = new FoodProduct("Apple",2.00);
        FoodProduct foodProduct2 = new FoodProduct("Apple",2.00);


        cart.addFoodProduct(foodProduct1);
        cart.addFoodProduct(foodProduct2);

        assertEquals(1, cart.getAllProducts());

    }
}
