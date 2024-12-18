package lesson10_practice.bt_more_v2;

import lesson10_practice.bt_more_v2.entities.Bill;
import lesson10_practice.bt_more_v2.entities.Customer;
import lesson10_practice.bt_more_v2.view.Menu;

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
