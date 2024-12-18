package lesson10_practice.bt_more.service;

import lesson10_practice.bt_more.entities.Bill;
import lesson10_practice.bt_more.entities.Customer;

import java.util.Scanner;

public class BillService {
    CustomerService customerService = new CustomerService();
    public Bill inputInfo(Scanner scanner){
        System.out.println("Mời b nhập thông tin KH sửi dụng điện: ");
        Customer customer = customerService.inputInfo(scanner);
        System.out.println("Nhập chỉ số cũ: ");
        int oldNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chỉ số mới: ");
        int newNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kỳ hđ: ");
        String tern = scanner.nextLine();
        return new Bill(oldNumber, newNumber,tern, customer);
    }

}
