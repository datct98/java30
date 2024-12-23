package lesson12_exception.chua_login.service;

import lesson12_exception.chua_login.entities.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {
    public void createProduct(Scanner scanner, ArrayList<Product>products){
        System.out.println("Mời  nhập tên sp:");
        String name = scanner.nextLine();
        System.out.println("Mời  nhập giá sp:");
        BigDecimal price = new BigDecimal(scanner.nextLine());
        Product product = new Product(name, price);
        products.add(product);
    }
}
