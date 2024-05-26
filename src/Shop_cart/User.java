package Shop_cart;


public class User {
    private String username;
    private String password;
    private Basket basket;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.basket = new Basket();
    }

    // Геттер для логина
    public String getUsername() {
        return username;
    }

    // Сеттер для логина
    public void setUsername(String username) {
        this.username = username;
    }

    // Геттер для пароля
    public String getPassword() {
        return password;
    }

    // Сеттер для пароля
    public void setPassword(String password) {
        this.password = password;
    }

    // Геттер для объекта корзины
    public Basket getBasket() {
        return basket;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", basket=" + basket +
                '}';
    }
}

