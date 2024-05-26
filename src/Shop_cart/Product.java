package Shop_cart;

public class Product {
    private String name;
    private double price;
    private int rating;

    public Product(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product(String novel) {
    }

    // Геттер для имени товара
    public String getName() {
        return name;
    }

    // Сеттер для имени товара
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для цены
    public double getPrice() {
        return price;
    }

    // Сеттер для цены
    public void setPrice(double price) {
        this.price = price;
    }

    // Геттер для рейтинга
    public int getRating() {
        return rating;
    }

    // Сеттер для рейтинга
    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}


