import org.junit.Test;
import static org.junit.Assert.*;

public class RemoveProductFromCartTest {

    @Test
    public void testRemoveProduct() {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Product B");
        cart.removeProduct("Product B");

        assertFalse(cart.contains("Product B"));
        assertEquals(0, cart.getItemCount());
        assertEquals(0.0, cart.getTotalPrice(), 0.01);
    }
}