import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ShopTest {

    @Test
    void priceCartIsCorrectCalculated() {
        Shop shop = new Shop(Main.getStoreItems());
        Cart cart = new Cart(shop);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(2);
        cart.addProductToCartByID(3);

        assertThat(cart.getTotalPrice().equals(620));
    }

        @Test
        void priceCartIsCorrect() {
            Shop shop = new Shop(Main.getStoreItems());
            Cart cart = new Cart(shop);
            cart.addProductToCartByID(1);
            cart.addProductToCartByID(1);
            cart.addProductToCartByID(1);

            assertThat(cart.getTotalPrice().equals(510));

        }
    @Test
    void priceCartIsCorrectDelete() {
        Shop shop = new Shop(Main.getStoreItems());
        Cart cart = new Cart(shop);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(2);
        cart.addProductToCartByID(3);
        cart.addProductToCartByID(2);
        cart.removeProductByID(2);

        assertThat(cart.getTotalPrice().equals(620));

    }
    @Test
    void quantityProduct(){
        Shop shop = new Shop(Main.getStoreItems());
        Cart cart = new Cart(shop);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);

        assertThat(shop.getProductsShop().get(0).getQuantity().equals(5));

    }
    @Test
    void quantityProductFull(){
        Shop shop = new Shop(Main.getStoreItems());
        Cart cart = new Cart(shop);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);


        assertThat(shop.getProductsShop().get(0).getQuantity().equals(10));

    }
    @Test
    void priceCartCorrectDelete() {
        Shop shop = new Shop(Main.getStoreItems());
        Cart cart = new Cart(shop);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.removeProductByID(1);
        assertThat(shop.getProductsShop().get(0).getQuantity().equals(7));
    }
    }
