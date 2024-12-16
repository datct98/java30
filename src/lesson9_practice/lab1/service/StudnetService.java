package lesson9_practice.lab1.service;

import lesson9_practice.lab1.entities.Student;

import java.util.Scanner;

public class StudnetService {
    public Student inputInfo(Scanner scanner){
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        return new Student(name);
    }
}
