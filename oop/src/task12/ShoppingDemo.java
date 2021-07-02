package task12;

public class ShoppingDemo {
    public static void main(String[] args) {
        Product product1 = new Product("red dress",1000,5);
        Product product2 = new Product("white socks",300,4.5);

        Product product3 = new Product("шоколад Twix",35,4.7);
        Product product4 = new Product("сыр Моцарелла",300,4.6);
        Product product5 = new Product("кофе Nescafe",250,4.8);

        Product[] products1 = {product1,product2};
        Category category1 = new Category("clothes",products1);

        Product[] products2 = {product3,product4,product5};
        Category category2 = new Category("food",products2);

        Basket basket1 = new Basket();

        User user1 = new User("stella13","password000", basket1);
        System.out.println(user1.getInfo());

        Product[] basket0 = {product1,product2,product5};
        basket1.setPurchase(basket0);
        System.out.println(user1.getInfo());

    }
}
