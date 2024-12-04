package lesson2_string;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Chữa b4 kt15p
        /*double vCar = 54;
        double vBike = 38;
        double t = 2.25;

        // s = v * t
        double sCar = vCar * t;
        double sBike = vBike *t;
        double sAB = sBike + sCar;
        System.out.println("Quãng đường AB là: "+sAB);*/
        // demo string
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời b nhập ngày tháng năm (yyyy/MM/dd)");
        String dateString = scanner.nextLine();
        LocalDate localDateAfterConvert = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(localDateAfterConvert.plusDays(3));

        System.out.println(LocalDateTime.now().plusDays(3));




    }
}
