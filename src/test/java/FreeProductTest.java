import org.example.FreeProduct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FreeProductTest {
    @Test
    void thePriceOfFreeProductsIsAlwaysZero() {
        FreeProduct freeProduct = new FreeProduct("Perejil", 0.0);

        double price = freeProduct.Price;

        assertEquals(0.0,price);
    }
}
