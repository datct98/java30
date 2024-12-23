package lesson12_exception;

import lesson12_exception.utils.Utils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("MỜi b nhập[ vào 1 số nguyên: ");
        Scanner scanner = new Scanner(System.in);
        //Integer n= Utils.inputInteger(scanner);

        //double price = scanner.nextDouble();
        BigDecimal price = new BigDecimal("1231231231232131231232131231231321231");
        //Date date = Utils.inputDate(scanner);


        System.out.println(price);
    }
}
