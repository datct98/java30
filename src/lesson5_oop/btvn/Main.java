package lesson5_oop.btvn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời b nhập số lượng bác sĩ: ");
        int numberDoctor = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời b nhập số lượng bệnh nhân: ");
        int numberPatient = Integer.parseInt(scanner.nextLine());

        Doctor[] doctors = new Doctor[numberDoctor];
        Patient[] patients = new Patient[numberPatient];
        // NHập thông tin bác sĩ
        System.out.println("Nhập thông tin bs: ");
        for (int i = 0; i < numberDoctor; i++) {
            Doctor doctor = inputInfoDoctor(scanner);
            doctors[i]=doctor;
        }

        // NHập thông tin bệnh nhân:
        System.out.println("Nhập thông tin bệnh nhân: ");
        for (int i = 0; i < numberDoctor; i++) {
            Patient patient = inputInfoPatient(scanner);
            patients[i]=patient;
        }

        for (int i = 0; i < numberDoctor; i++) {
            System.out.println(doctors[i]);
        }

        for (int i = 0; i < numberPatient; i++) {
            System.out.println(patients[i]);
        }
    }

    public static Doctor inputInfoDoctor(Scanner scanner){
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("NHập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số giờ làm vc: ");
        int numberHour = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chuyên môn:");
        String major = scanner.nextLine();
        Doctor doctor = new Doctor(name,age, numberHour,major);
        return doctor;
    }

    public static Patient inputInfoPatient(Scanner scanner){
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("NHập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số bệnh án: ");
        int number = Integer.parseInt(scanner.nextLine());
        Patient patient = new Patient(name, age, number);
        return patient;
    }

}
