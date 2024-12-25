package lesson13_generic.lib;

import lesson13_generic.lib.view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        do {
            menu.displayMenu(scanner);

        } while (true);
    }
}
