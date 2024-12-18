package lesson10_practice.bt_more.service;

import lesson10_practice.bt_more.entities.Customer;

import java.util.Scanner;

public class CustomerService {
    public Customer inputInfo(Scanner scanner){
        System.out.println("Mời b nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập mã công tơ:");
        String code = scanner.nextLine();
        return  new Customer(name, code);
    }
}
