package lesson8_arraylist.techmaster.service;

import lesson8_arraylist.techmaster.entities.Student;

import java.util.Scanner;

public class StudentService {
    public Student inputInfo(Scanner scanner){
        System.out.println("Mời b nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        return new Student(id, name, age);
    }
}
