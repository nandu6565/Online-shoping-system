import java.util.Map;
import java.util.HashMap;

public class Order {
    private static int orderCounter = 1;
    private int orderId;
    private Map<Product, Integer> cartItems;
    private double totalPrice;
    private String orderStatus;

    public Order(Cart cart) {
        this.orderId = orderCounter++;
        this.cartItems = new HashMap<>(cart.getCartItems());
        this.totalPrice = cart.getTotalPrice();
        this.orderStatus = "Pending";
    }

    public void placeOrder() {
        System.out.println("Order placed successfully. Order ID: " + orderId);
        System.out.println("Total Price: " + totalPrice);
        orderStatus = "Pending";
    }

    public void updateStatus(String status) {
        this.orderStatus = status;
    }

    public int getOrderId() { return orderId; }
    public Map<Product, Integer> getCartItems() { return cartItems; }
    public double getTotalPrice() { return totalPrice; }
    public String getOrderStatus() { return orderStatus; }
}
