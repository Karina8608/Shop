package Shop_cart;

public class Run {
    public static void main(String[] args) {
        // Создаем несколько объектов класса Category
        Product[] electronics = {new Product("Laptop"), new Product("Smartphone")};
        Category electronicsCategory = new Category("Electronics", electronics);

        Product[] books = {new Product("Novel"), new Product("Textbook")};
        Category booksCategory = new Category("Books", books);

        // Выводим информацию о категориях
        System.out.println("Категория: " + electronicsCategory.getName());
        for (Product product : electronicsCategory.getProducts()) {
            System.out.println("Товар: " + product.getName());
        }

        System.out.println("\nКатегория: " + booksCategory.getName());
        for (Product product : booksCategory.getProducts()) {
            System.out.println("Товар: " + product.getName());
        }
    }
}

