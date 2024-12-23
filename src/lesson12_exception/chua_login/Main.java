package lesson12_exception.chua_login;

import lesson12_exception.chua_login.entities.User;
import lesson12_exception.chua_login.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("datct", "123", "dat@gmail.com", 0));
        users.add(new User("Hieu", "123", "dat@gmail.com", null));
        users.add(new User("thinh", "123", "dat@gmail.com", 1));

        Menu menu = new Menu();

        do {
            menu.displayMenu(scanner, users);
        } while (true);

    }
}
