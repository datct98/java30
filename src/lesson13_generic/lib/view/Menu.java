package lesson13_generic.lib.view;

import java.util.Scanner;

public class Menu {
    public void displayMenu(Scanner scanner){
        System.out.println("1- Thêm sách");
        System.out.println("2- Sửa sách");
        System.out.println("3- Xóa sách");

        System.out.println("4- Thêm khách hàng");
        System.out.println("5- Sửa khách hàng");
        System.out.println("6- Xóa khách hàng");

        System.out.println("7- Thêm phiếu mượn");
        System.out.println("8- Sửa phiếu mượn");
        System.out.println("9- Xóa phiếu mượn");

        System.out.println("Mời b lựa chọn");
        selectMenu(scanner);
    }

    public void selectMenu(Scanner scanner){
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                break;
            case 4:
                break;
            case 7:
                break;

        }
    }
}
