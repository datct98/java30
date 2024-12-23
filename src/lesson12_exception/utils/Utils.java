package lesson12_exception.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
// Code các hàm dùng chung
public class Utils {
    public static Integer inputInteger(Scanner scanner){
        try {
            int n = Integer.parseInt(scanner.nextLine());
           return n;
        } catch (Exception e){
            System.out.println("LỖi "+e);
            return null;
        }
    }

    public static Date inputDate(Scanner scanner)  {
        String dateString = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        try {
            date = sdf.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Có lỗi xảy ra "+e);
            return null;
        }
        return date;
    }
}
