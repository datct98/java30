package lesson10_practice.bt_more_v2.service;

import lesson10_practice.bt_more_v2.entities.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService {
    public Customer inputInfo(Scanner scanner){
        System.out.println("Mời b nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập mã công tơ:");
        String code = scanner.nextLine();
        return  new Customer(name, code);
    }

    public Customer findById(String id, ArrayList<Customer> customers){
        for (Customer customer: customers){
            if(customer.getId().equals(id)){
                return customer;
            }
        }
        return null;
    }
}
