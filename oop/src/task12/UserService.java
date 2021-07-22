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

        for (int i = 0; i < 3; i++) {
            if (check) break;
            if (i > 0) System.out.println("Wrong login and password. Try one more time.");
            System.out.print("Input username:");
            String login = scanner.nextLine();
            System.out.print("Input password:");
            String password = scanner.nextLine();
            System.out.println();

            for (User user : usersArray) {
                if (login.equals(user.getLogin())) {
                    if (password.equals(user.getPassword())) {
                        currentUser = user;
                        check = true;
                        break;
                    }
                }
            }
        }
        if (!check) {
            System.out.println("You've mistaken 3 times");
            System.exit(0);
        }
        return currentUser;
    }
}
