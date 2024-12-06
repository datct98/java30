package lesson6_abstract.shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời b nhập thông tin hình vuông: ");
        System.out.println("Nhập cạnh HV: ");
        int side = Integer.parseInt(scanner.nextLine());
        Square square = new Square(side);

        System.out.println("Mời b nhập thông tin hình chữ nhật: ");
        System.out.println("Nhập chiều dài: ");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chiều rộng: ");
        int width = Integer.parseInt(scanner.nextLine());
        Shape rectangle = new Rectangle(length, width);
        square.printInfo();
        rectangle.printInfo();

    }
}
