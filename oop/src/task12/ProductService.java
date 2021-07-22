package task12;

public class ProductService {
    private Product[] products;

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public String getInfo() {
        String s = "";
        for (Product p : products) {
            s = s + p.getInfo();
        }
        return s;
    }

    public void cheaperProducts(Product product) {
        for (Product element : products) {
            if (element.getPrice() < product.getPrice()) System.out.println(element.getInfo());
        }
    }

    public void allProducts() {
        for (Product product : products) System.out.println(product.getInfo());
    }

}