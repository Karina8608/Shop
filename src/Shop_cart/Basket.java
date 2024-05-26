package Shop_cart;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> purchasedProducts;

    public Basket() {
        this.purchasedProducts = new ArrayList<>();
    }

    // Метод для добавления купленного товара в корзину
    public void addProduct(Product product) {
        purchasedProducts.add(product);
    }

    // Метод для получения списка купленных товаров
    public List<Product> getPurchasedProducts() {
        return purchasedProducts;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "purchasedProducts=" + purchasedProducts +
                '}';
    }

}

