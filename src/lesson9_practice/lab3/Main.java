package lesson9_practice.lab3;

import lesson9_practice.lab3.entities.Worker;
import lesson9_practice.lab3.service.WorkerService;
import lesson9_practice.lab3.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Worker> workers = new ArrayList<>();
        Menu menu = new Menu();
        do {
            menu.displayMenu(scanner, workers);
        } while (true);


    }
}
