package lesson5_oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Mời người dùng nhập vào thông tin của một học sinh: tên, lớp học, bộ môn -> in ra
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời b nhập số lượng công nhận: ");
        int n = Integer.parseInt(scanner.nextLine());

        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Mời b nhập tên công nhân: ");
            String name = scanner.nextLine();
            System.out.println("Mời b nhập tuổi: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Mời b nhập địa chỉ: ");
            String address = scanner.nextLine();
            System.out.println("Mời b nhập nơi làm việc: ");
            String place = scanner.nextLine();
            System.out.println("Mời b nhập số năm kn: ");
            double exp = Double.parseDouble(scanner.nextLine());
            Employee employee = new Employee(name, age, address, place, exp);
            employees[i] = employee;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(employees[i]);
        }

    }
}
