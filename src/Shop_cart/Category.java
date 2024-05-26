package Shop_cart;


public class Category {
    private String name;
    private Product[] products;

    // Конструктор класса
    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    // Геттер для имени категории
    public String getName() {
        return name;
    }

    // Геттер для массива товаров
    public Product[] getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }

}


