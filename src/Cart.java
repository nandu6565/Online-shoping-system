import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartItems;
    private double totalPrice;

    public Cart() {
        cartItems = new HashMap<>();
        totalPrice = 0.0;
    }

    public void addProduct(Product product, int quantity) {
        if (product.isAvailable() && product.getStock() >= quantity) {
            cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
            product.setStock(product.getStock() - quantity);
            calculateTotalPrice();
        } else {
            System.out.println("Insufficient stock for product: " + product.getName());
        }
    }

    public void removeProduct(Product product) {
        if (cartItems.containsKey(product)) {
            int quantity = cartItems.get(product);
            product.setStock(product.getStock() + quantity);
            cartItems.remove(product);
            calculateTotalPrice();
        }
    }

    public double calculateTotalPrice() {
        totalPrice = 0.0;
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            totalPrice += entry.getKey().getPrice() * entry.getValue();
        }
        return totalPrice;
    }

    public void clearCart() {
        cartItems.clear();
        totalPrice = 0.0;
    }

    public Map<Product, Integer> getCartItems() {
        return cartItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
