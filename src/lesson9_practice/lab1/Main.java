package lesson9_practice.lab1;

import lesson9_practice.lab1.entities.Student;
import lesson9_practice.lab1.service.StudnetService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudnetService service = new StudnetService();
        ArrayList<Student> students = new ArrayList<>();

        do {
            Student student = service.inputInfo(scanner);
            students.add(student);
            System.out.println("B có muốn nhập tiếp hông? ");
            String choose = scanner.nextLine();
            if(choose.equalsIgnoreCase("N")){
                break;
            }
        } while (true);
        System.out.println(students);
    }
}
