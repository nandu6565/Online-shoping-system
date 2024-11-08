public class Product {
    private int productId;
    private String name;
    private double price;
    private String description;
    private int stock;

    public Product(int productId, String name, double price, String description, int stock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getDescription() { return description; }
    public int getStock() { return stock; }

    public void setStock(int stock) { this.stock = stock; }

    public boolean isAvailable() {
        return stock > 0;
    }
}
