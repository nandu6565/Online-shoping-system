public class Main {
    public static void main(String[] args) {
        // Creating products
        Product product1 = new Product(1, "Laptop", 999.99, "High-performance laptop", 10);
        Product product2 = new Product(2, "Smartphone", 499.99, "Latest model smartphone", 20);
        Product product3 = new Product(3, "TV", 199.99, "4K TV", 50);
        Product product4 = new Product(4, "Washing Machine", 99.99, "DD Motor", 20);


        Cart cart = new Cart();


        cart.addProduct(product1, 1);
        cart.addProduct(product2, 2);
        cart.addProduct(product2, 2);
        cart.addProduct(product2, 1);

        System.out.println("Cart Total Price: " + cart.getTotalPrice());

        // Placing an order
        Order order = new Order(cart);
        order.placeOrder(); //

        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Order Status: " + order.getOrderStatus());
    }
}
