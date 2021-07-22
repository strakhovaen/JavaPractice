package task12;

public class Product {
    private int productNumber;
    private String name;
    private int price;
    private double rating;

    public Product() {
    }

    public Product(int productNumber, String name, int price, double rating) {
        this.productNumber = productNumber;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public int getProductNumber() {
        return productNumber;
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

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
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

    public String getInfo() {
        return "Номер: " + productNumber + ". Название товара: " + getName() + ". Цена: " + getPrice() + " р. Рейтинг: " + getRating() + '\n';
    }
}