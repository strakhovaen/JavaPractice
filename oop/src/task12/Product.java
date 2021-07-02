package task12;

public class Product {
    private String name;
    private int price;
    private double rating;

    public Product() {
    }

    public Product(String name, int price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public static void main(String[] args) {
        Product product1 = new Product("red dress", 1000, 5);
        Product product2 = new Product("white socks", 300, 4.5);
    }

    public String getInfo() {
        return "Название товара: " + getName() + ". Цена: " + getPrice() + " р. Рейтинг: " + getRating() + '\n';
    }
}
