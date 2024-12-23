package lesson12_exception.chua_login.service;

import lesson12_exception.chua_login.entities.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    public User login(Scanner scanner, ArrayList<User> users){
        System.out.println("Mời b nhập username: ");
        String username = scanner.nextLine();
        System.out.println("Mời b nhập password: ");
        String password = scanner.nextLine();
        User user = findByUsernameAndPassword(username, password, users);
        if(user !=null){
            System.out.println("Login successful");
        } else {
            System.out.println("Login fail");
        }
        return user;
    }

    public User findByUsernameAndPassword(String username, String password, ArrayList<User> users){
        for (User user: users){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }
}
