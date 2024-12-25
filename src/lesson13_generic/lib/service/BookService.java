package lesson13_generic.lib.service;

import lesson13_generic.lib.entities.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookService implements IService<Book>{

    @Override
    public Book insert(Scanner scanner) {
        System.out.println("Mời b nhập tên sách: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập số lượng sách: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        return new Book(name, quantity);
    }

    @Override
    public void delete(Scanner scanner, ArrayList<Book> objs) {
        System.out.println("Mời b nhập id sách: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Book book: objs){
            if(id== book.getId()){
                objs.remove(book);
            }
        }
    }
}
