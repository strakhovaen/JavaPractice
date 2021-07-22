package task12;

import java.util.Scanner;

public class User {
    private String login;
    private String password;
    private Basket basket;
    private double money;

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(String login, String password, Basket basket, double money) {
        this.login = login;
        this.password = password;
        this.basket = basket;
        this.money = money;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Basket getBasket() {
        return basket;
    }

    public double getMoney() {
        return money;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getInfo() {
        return "Login: " + getLogin() + '\n' +
                "Products in the basket:" + '\n' + basket.getInfo() + '\n';
    }

    public void addMoney() {
        System.out.println("Insert the sum you want to add: ");
        Scanner scanner = new Scanner(System.in);
        double sum = scanner.nextDouble();
        money = money + sum;
        System.out.println("Done!" + '\n' + "Money available: " + money);
    }
}
