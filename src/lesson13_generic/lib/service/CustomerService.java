package lesson13_generic.lib.service;

import lesson13_generic.lib.entities.Book;
import lesson13_generic.lib.entities.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService implements IService<Customer>{

    @Override
    public Customer insert(Scanner scanner) {
        System.out.println("Mời b nhập tên KH: ");
        String name = scanner.nextLine();

        return new Customer(name);
    }

    @Override
    public void delete(Scanner scanner, ArrayList<Customer> objs) {
        System.out.println("Mời b nhập id sách: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Customer cus : objs) {
            if (id == cus.getId()) {
                objs.remove(cus);
            }
        }
    }
}
