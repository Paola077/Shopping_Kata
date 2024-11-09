import org.example.FoodProduct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodProductTest {
    @Test
    void FoodPriceWithDiscount() {
        FoodProduct foodProduct = new FoodProduct("Apple",2.00);

        double discount = foodProduct.applyDiscountFood();

        assertEquals(1.70,discount);
    }

    @Test
    void FoodPriceWhitoutDiscount() {
        FoodProduct foodProduct = new FoodProduct("Rice",3.75);

        double price = foodProduct.getPrice();

        assertEquals(3.75,price);
    }
}
