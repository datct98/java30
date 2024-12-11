package lesson6_abstract.techmaster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời b nhập số lượng hs trong lớp");
        int n = Integer.parseInt(scanner.nextLine());
        ITStudent[] itStudents = new ITStudent[n];
        BizStudent[] bizStudents = new BizStudent[n];
        TechmasterStudent[] students = new TechmasterStudent[n];

        // B1: NHập số lượng hs
        // Lựa chọn loại hs (biz, It) -> để lưu vào phù hợp
        // For để nhập thông tin
        // Lưu vào mảng
        ITStudent itStudent = new ITStudent("Dat", "JAVA", 8);
        students[0] = itStudent;
        for (int i = 0; i < n; i++) {

        }
    }
}
