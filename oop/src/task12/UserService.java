package task12;

import java.util.Scanner;

public class UserService {
    private User[] users;


    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public String getInfo() {
        String s = "";
        for (User u : this.users) {
            s = s + u.getInfo();
        }
        return s;
    }

    public User authorization() {
        System.out.println("YOU NEED TO LOG IN.");

        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        User currentUser = new User();
        User[] usersArray = users;

        /*for (User u : users) {
            System.out.println(u.getInfo());
        };*/

        for (int i = 0; i < 3; i++) {
            System.out.println(check);
            if (check) break;
            System.out.print("Input username:");
            String login = scanner.nextLine();
            System.out.print("Input password:");
            String password = scanner.nextLine();
            System.out.println();

            for (User user : usersArray) {

                System.out.println("get info");
                System.out.print(user.getInfo());
                System.out.println("user login:" + user.getLogin());
                System.out.println("login:" + login);
                System.out.println();

                System.out.println("equals = " + login.equals(user.getLogin()));
                if //(login == user.getLogin())
                (login.equals(user.getLogin())) {
                    System.out.println("this user login");
                    if (password == user.getPassword()) {
                        System.out.println("this user password");
                        currentUser = user;
                        check = true;
                        break;
                    }
                }
            }
        }
        System.out.println("You've mistaken 3 times");
        if (!check) System.exit(0);
        return currentUser;
    }
}
