package lesson10_practice.bt_more_v2.view;

import lesson10_practice.bt_more_v2.entities.Bill;
import lesson10_practice.bt_more_v2.entities.Customer;
import lesson10_practice.bt_more_v2.service.BillService;
import lesson10_practice.bt_more_v2.service.CustomerService;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    CustomerService customerService = new CustomerService();
    BillService billService = new BillService();
    public void displayMenu(Scanner scanner, ArrayList<Customer> customers, ArrayList<Bill> bills){
        System.out.println("1- Nhập thông tin khách hàng: ");
        System.out.println("2- Hiển thị thông tin KH");
        System.out.println("3- Nhập thông tin Biên lai: ");
        System.out.println("4- Hiển thị thông tin Biên lai");
        System.out.println("Mời b lựa chọn");
        selectMenu(scanner, customers, bills);
    }

    public void selectMenu(Scanner scanner, ArrayList<Customer> customers, ArrayList<Bill> bills){
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                Customer customer = customerService.inputInfo(scanner);
                customers.add(customer);
                break;
            case 2:
                System.out.println(customers);
                break;
            case 3:
                Bill bill = billService.inputInfo(scanner);
                bills.add(bill);
                break;
            case 4:
                System.out.println(bills);
                break;

        }
    }
}
