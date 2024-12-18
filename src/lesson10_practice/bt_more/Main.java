package lesson10_practice.bt_more;

import lesson10_practice.bt_more.entities.Bill;
import lesson10_practice.bt_more.entities.Customer;
import lesson10_practice.bt_more.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Bill> bills = new ArrayList<>();
        Menu menu = new Menu();
        do {
            menu.displayMenu(scanner, customers, bills);
        } while (true);
    }
}
