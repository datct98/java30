package lesson13_generic.lib.service;

import java.util.ArrayList;
import java.util.Scanner;

public interface IService <T> {
    T insert(Scanner scanner);
    void delete(Scanner scanner, ArrayList<T> objs);

}
