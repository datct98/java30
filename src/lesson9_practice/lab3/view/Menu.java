package lesson9_practice.lab3.view;

import lesson9_practice.lab3.entities.Worker;
import lesson9_practice.lab3.service.WorkerService;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    WorkerService workerService = new WorkerService();
    public void displayMenu(Scanner scanner, ArrayList<Worker> workers){
        System.out.println("Worker Management");
        System.out.println("1- Tạo công nhân");
        System.out.println("2- Tăng lương");
        System.out.println("3- Giảm lương");
        System.out.println("4- Hiển thị thoogn tin");
        System.out.println("Mời b lựa chọn");
        selectMenu(scanner, workers);
    }

    public void selectMenu(Scanner scanner, ArrayList<Worker> workers){
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                Worker worker = workerService.inputInfo(scanner);
                workers.add(worker);
                break;
            case 2:
                workerService.modifySalary(scanner, workers, "+");
                break;
            case 3:
                break;
            case 4:
                System.out.println(workers);
                break;
            default:
                System.exit(0);
        }
    }
}
