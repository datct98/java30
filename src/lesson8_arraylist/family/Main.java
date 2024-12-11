package lesson8_arraylist.family;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời b nhập số lượng thành viên trong gđ: ");
        int n = Integer.parseInt(scanner.nextLine());
        // Khởi tạo ra mảng lưu trữ các member
        ArrayList<Member> members = new ArrayList<>();

        System.out.println("Mời b nhập thông tin id hộ dân: ");
        int idFml = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời b nhập thông tin số nhà: ");
        int numberHouse = Integer.parseInt(scanner.nextLine());

        // Nhập thoogn tin cho các thành viên
        for (int i = 0; i < n; i++) {
            System.out.println("MỜi b nhập thành viên thứ: "+(i+1));
            System.out.println("MỜi b nhập id: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("MỜi b nhập tên: ");
            String name = scanner.nextLine();
            System.out.println("MỜi b nhập công việc: ");
            String job = scanner.nextLine();
            Member member = new Member(id, name, job);
            // Lưu member vào mảng
            members.add(member);
        }
        Family family = new Family(idFml, numberHouse, members);
        System.out.println(family);
    }
}
