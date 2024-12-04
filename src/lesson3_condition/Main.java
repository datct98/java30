package lesson3_condition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Mời b nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        System.out.println(name+" - "+age);*/

        for (int i=0; i<10; i++){

            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
