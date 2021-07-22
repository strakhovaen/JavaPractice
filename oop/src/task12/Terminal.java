package task12;

import java.util.Scanner;

public class Terminal {
    private static UserService userService = new UserService();
    private static ProductService productService = new ProductService();
    private static User user = new User();

    static {
        Product product1 = new Product(1, "red dress",1000,5);
        Product product2 = new Product(2, "white socks",300,4.5);
        Product product3 = new Product(3, "шоколад Twix",35,4.7);
        Product product4 = new Product(4,"сыр Моцарелла",300,4.6);
        Product product5 = new Product(5,"кофе Nescafe",250,4.8);
        Product product6 = new Product(6,"tea Tess", 100, 4.3);
        Product product7 = new Product(7,"black pants", 1500, 4);

        Product[] products = {product1, product2, product3, product4, product5, product6, product7};

        productService.setProducts(products);
        //productService.getInfo();

        Product[] products1 = {product1, product2, product7};
        Category category1 = new Category("clothes",products1);

        Product[] products2 = {product3, product4, product5,product6};
        Category category2 = new Category("food",products2);


        Basket basket0 = new Basket();
        Basket basket1 = new Basket();
        Basket basket2 = new Basket();
        Basket basket3 = new Basket();

        User user0 = new User("admin","admin0", basket0, 0);
        User user1 = new User("stella13","stella13", basket1, 2000);
        User user2 = new User("user100","password100", basket2,1000);
        User user3 = new User("justaguy","justapassword1", basket3, 500);

        Product[] basket = {product1, product2};
        user1.getBasket().setBasket(basket);

        User[] users = {user0, user1, user2, user3};
        userService.setUsers(users);
    }


    public String getInfo() {
        return user.getInfo();
    }

    public static ProductService getProductService() {
        return productService;
    }

    public static User getUser() {
        return user;
    }

    public static void setProductService(ProductService productService) {
        Terminal.productService = productService;
    }

    public static void setUser(User user) {
        Terminal.user = user;
    }


    public static void menu() {
        int command = 0;
        Scanner scanner = new Scanner(System.in);

        while (command != 3) {
            System.out.println(
                            " ------" + '\n' +
                            "| MENU |" + '\n' +
                            " ------" + '\n' +
                            "Enter one of the following commands:" + '\n' +
                            "1. basket" + '\n' +
                            "2. products list" + '\n' +
                            "3. exit");

            command = scanner.nextInt();

            switch (command) {
                case 1 :
                   if (user.getLogin() == null) setUser(userService.authorization());
                    System.out.println(user.getInfo());
                    basketMenu();
                    break;
                case 2 :
                    productService.allProducts();
                    break;
                case 3 :
                    System.exit(0);
                default:
                    System.out.println("Unknown command!");
            }
        }
    }

    public static void basketMenu() {
        int command = 0;
        Scanner scanner = new Scanner(System.in);

        while ((command != 5) & (command != 6)) {
            System.out.println(
                        " -------"  + '\n' +
                        "| BASKET |" + '\n' +
                        " ------"  + '\n' +
                        "Enter one of the following commands:" + '\n' +
                        "1. products in my basket" + '\n' +
                        "2. money available" +  '\n' +
                        "3. delete product" + '\n' +
                        "4. add product" + '\n' +
                        "5. add money" + '\n' +
                        "6. back to main menu" + '\n' +
                        "7. exit" + '\n');

            command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("Products in my basket:");
                    System.out.println(user.getBasket().getInfo());
                    System.out.println("Enter any symbol to continue...");
                    int next1 = 0;
                    next1 = (int) scanner.next().charAt(0);
                    if (next1 != 0) break;
                    break;
                case 2:
                    System.out.println("Money available: " + user.getMoney() + " р");
                    System.out.println("Enter any symbol to continue...");
                    int next2 = 0;
                    next2 = (int) scanner.next().charAt(0);
                    if (next2 != 0) break;
                    break;
                case 3 :
                    System.out.println("Input number of product you want to delete:");
                    int delNumber = scanner.nextInt();
                    user.getBasket().setBasket(user.getBasket().deletePurchase(delNumber));
                    System.out.println("Enter any symbol to continue...");
                    int next3 = 0;
                    next3 = (int) scanner.next().charAt(0);
                    if (next3 != 0) break;
                    break;
                case 4:
                    System.out.println("Input number of product you want to add:");
                    int addNumber = scanner.nextInt();
                    user.getBasket().setBasket(user.getBasket().addPurchase(addNumber));
                    System.out.println("Enter any symbol to continue...");
                    int next4 = 0;
                    next4  = (int) scanner.next().charAt(0);
                    if (next4 != 0) break;
                    break;
                case 5 :
                    user.addMoney();
                    System.out.println("Enter any symbol to continue...");
                    int next5 = 0;
                    next5 = (int) scanner.next().charAt(0);
                    if (next5 != 0) break;
                case 6 :
                    break;
                case 7 :
                    System.exit(0);
                default:
                    System.out.println("Unknown command!");
            }
        }
    }
}
