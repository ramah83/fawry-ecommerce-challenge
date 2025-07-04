public class Product {
    protected String name;
    protected double quantity;
    protected int price;

    public Product() {
    }

    public Product(String name, double quantity, int price) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void lowerStock(int amt) {
        if (quantity >= amt) {
            quantity -= amt;
        } else {
            throw new IllegalArgumentException("Can't cover that amount");
        }
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }
}
