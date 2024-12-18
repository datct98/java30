package lesson10_practice.bt_more_v2.service;

import lesson10_practice.bt_more_v2.entities.Bill;
import lesson10_practice.bt_more_v2.entities.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class BillService {
    CustomerService customerService = new CustomerService();
    public Bill inputInfo(Scanner scanner){
        System.out.println("Mời b nhập id KH sửi dụng điện: ");
        String cusId = scanner.nextLine();
        System.out.println("Nhập chỉ số cũ: ");
        int oldNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chỉ số mới: ");
        int newNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kỳ hđ: ");
        String tern = scanner.nextLine();
        return new Bill(oldNumber, newNumber,tern, cusId);
    }

    public void printInfo(ArrayList<Bill> bills, ArrayList<Customer>customers){
        for (Bill bill: bills){
            System.out.println("Customer: ");
            customerService.findById(bill.getCustomerId(), customers);
            System.out.println("Bill id: "+bill.getId());

        }

    }

}
