package lesson7_interface.news;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời b nhập tiêu đề: ");
        String title = scanner.nextLine();
        System.out.println("Mời b nhập tác giả: ");
        String author = scanner.nextLine();
        System.out.println("Mời b nhập đánh giá: ");
        double rate = Double.parseDouble(scanner.nextLine());
        News news = new News(title, author, rate);

        news.display();
    }
}
