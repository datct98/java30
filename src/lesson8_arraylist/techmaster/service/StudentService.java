package lesson8_arraylist.techmaster.service;

import lesson8_arraylist.techmaster.entities.Student;

import java.util.ArrayList;
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

    public void updateNameStudent(Scanner scanner, ArrayList<Student> students){
        System.out.println("Mời b nhập ID học viên muốn update: ");
        int id = Integer.parseInt(scanner.nextLine());
        Student student = findById(id, students);
        if(student==null){
            System.out.println("KHông tìm thấy");
        } else {
            System.out.println("Mời b nhập tên mới cho học viên: ");
            String name = scanner.nextLine();
            student.setName(name);
        }
    }

    public void deleteStudent(Scanner scanner, ArrayList<Student> students){
        System.out.println("Mời b nhập ID học viên muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        Student student = findById(id, students);
        if(student==null){
            System.out.println("KHông tìm thấy");
        } else {
            students.remove(student);
        }
    }

    public Student findById(int id, ArrayList<Student> students){
        for (Student student: students){
            if(student.getId() == id){
                return student;
            }
        }
        return null;
    }

}
