package lesson9_practice.lab3.service;

import lesson9_practice.lab3.entities.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerService {
    public Worker inputInfo(Scanner scanner){
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập lương: ");
        double salary =Double.parseDouble( scanner.nextLine());
        return new Worker(name, salary);
    }

    public void upSalary(Scanner scanner, ArrayList<Worker> workers){
        System.out.println("MỜi b nhậ[ id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Worker worker = findById(id, workers);
        if(worker == null){
            System.out.println("K tìm thấy công nhân có id: "+id);
        } else {
            System.out.println("Mời b nhập số tiền muốn tăng: ");
            double money =Double.parseDouble( scanner.nextLine());
            worker.setSalary(worker.getSalary()+money);
        }

    }

    public Worker findById(int id, ArrayList<Worker> workers){
        for (Worker worker: workers){
            if(worker.getId()==id){
                return worker;
            }
        }
        return null;
    }
}
