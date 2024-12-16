package lesson9_practice.lab2.service;

import lesson9_practice.lab2.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public Student inputInfo(Scanner scanner){
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập điểm toán: ");
        double math = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời b nhập điểm lý: ");
        double physic = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời b nhập điểm hóa: ");
        double chemistry = Double.parseDouble(scanner.nextLine());
        return new Student(name, math, physic, chemistry);
    }

    public String classify(Student student){
        double avgScore = (student.getChemistry() + student.getMath() + student.getPhysic())/3;
        if(avgScore>=8)
            return "A";
        else if(avgScore>=6.5)
            return "B";
        else return "C";
    }

    public void displayPercent(ArrayList<Student> students){
        double countA=0, countB=0,countC =0;
        for (Student student: students){
            String type =classify(student);
            if(type.equals("A")){
                countA++;
            } else if(type.equals("B")){
                countB++;
            } else countC++;
        }
        System.out.println("%A: "+(countA/students.size()*100));
        System.out.println("%B: "+(countB/students.size()*100));
        System.out.println("%C: "+(countC/students.size()*100));
    }

}
