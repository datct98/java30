package lesson12_exception.chua_login;

import lesson12_exception.chua_login.entities.Product;
import lesson12_exception.chua_login.entities.User;
import lesson12_exception.chua_login.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("datct", "123", "dat@gmail.com", 0));
        users.add(new User("Hieu", "123", "dat@gmail.com", 2));
        users.add(new User("thinh", "123", "dat@gmail.com", 1));

        ArrayList<Product> products = new ArrayList<>();

        Menu menu = new Menu();

        do {
            menu.displayMenu(scanner, users, products);
        } while (true);

        // sau khi login xong chia role: customer và seller
        // Customer: Hiển thị tính năng: 1-> Xem danh sách sản phẩm,
        //      2-> xem chi tiết sản phẩm, 3-> Tìm kiếm sản phẩm theo khoảng giá
        // Seller: Hiển thị tính năng: 1-> Xem danh sách sản phẩm,
        //      2-> Chỉnh sửa thông tin giá sản phẩm
        //      3 -> Xóa sp

    }
}
