package lesson12_exception.chua_login.view;

import lesson12_exception.chua_login.entities.Product;
import lesson12_exception.chua_login.entities.User;
import lesson12_exception.chua_login.service.ProductService;
import lesson12_exception.chua_login.service.UserService;
import lesson12_exception.chua_login.utils.Constant;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    UserService userService = new UserService();
    ProductService productService = new ProductService();

    public void displayMenu(Scanner scanner, ArrayList<User> users, ArrayList<Product> products){
        System.out.println("1 - Đăng nhập\n" +
                "\n" +
                "2 - Đăng ký\n");
        System.out.println("Mời b chọn:");
        selectMenu(scanner, users, products);
    }

    public void selectMenu(Scanner scanner, ArrayList<User> users, ArrayList<Product> products){
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                User user = userService.login(scanner, users);
                System.out.println(user);
                if(user!=null){
                    if(Constant.ROLE_ADMIN == user.getRole() ){
                        displayMenuForAdmin();
                    } else if( Constant.ROLE_CUSTOMER== user.getRole()){
                        displayMenuForCustomer();
                    } else if(Constant.ROLE_SELLER == user.getRole()){
                        displayMenuForSeller(scanner, products);
                    }
                }
                break;
            case 2:
                break;

        }
    }

    public void displayMenuPostLogin(){
        System.out.println("1 - Thay đổi username\n" +
                "\n" +
                "2 - Thay đổi email\n" +
                "\n" +
                "3 - Thay đổi mật khẩu\n" +
                "\n" +
                "4 - Đăng xuất (Sau khi đăng xuất quay về mục yêu cầu đăng nhập hoặc đăng ký)\n" +
                "\n" +
                "0 - Thoát chương trình\n");
        System.out.println("Mời b lựa chọn: ");
    }

    public void displayMenuForAdmin(){
        System.out.println("1- Thêm sản phẩm");
        System.out.println("2- Xóa sản phẩm");
    }

    public void displayMenuForCustomer(){
        System.out.println("1- Xem sản phẩm");
        System.out.println("2- Xem chi tiết sản phẩm");
    }

    public void displayMenuForSeller(Scanner scanner, ArrayList<Product> products) {
        System.out.println("1- Xem sản phẩm");
        System.out.println("2- Chỉnh sửa giá sản phẩm");
        System.out.println("3- Xóa sp");
        System.out.println("Mời b lựa chọn: ");
        selectMenuForSeller(scanner,products);
    }

    public void selectMenuForSeller(Scanner scanner, ArrayList<Product> products){
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                productService.createProduct(scanner, products);
                break;
            case 2:

                break;

        }
    }

}
