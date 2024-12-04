package lesson4_array;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int ar[] = new int[3];
        Scanner scanner = new Scanner(System.in);
        /*for (int i = 0; i < ar.length; i++) {
            System.out.println("MỜi b nhập vào số  thứ "+(i+1));
            ar[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }*/

        // Tính tổng tất cả các số từ 0->n
        calculateSum(scanner);
        int multi=calculateMul(scanner);
        System.out.println("Tích: "+multi);
        // Cách dễ nhất
        calculateSumArray(scanner);
    }
    // tên hàm bắt  đầu bằng chữ cái thường
    // Mỗi hàm chỉ dùng cho một mục đích duy nhất// dùng cho một tính nawg duy nhất
    // Tên hàm khoogn được đặt trùng nhau
    public static void calculateSum(Scanner scanner){

        System.out.println("Mời b nhập số nguyên n: ");
        int n = Integer.parseInt(scanner.nextLine());
        int sum =0;
        for (int i = 1; i <=n; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }

    public static int calculateMul(Scanner scanner){

        System.out.println("Mời b nhập số nguyên n: ");
        int n = Integer.parseInt(scanner.nextLine());
        int mul =1;
        for (int i = 1; i <=n; i++) {
            mul*=i;
        }
        //System.out.println(mul);
        return mul;
    }

    // Cho số nguyên n, thực hiện lưu các số vào mảng -> tính tổng, tách hàm

    public static void calculateSumArray(Scanner scanner){
        int arr []=inputArray(scanner);

        // Tính tổng
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i] ;
        }
        System.out.println(sum);
    }

    public static int [] inputArray(Scanner scanner){
        System.out.println("Mời b nhập số nguyên n: ");
        int n = Integer.parseInt(scanner.nextLine());
        int arr[] = new int[n];
        // Nhập gtri cho array
        for (int i = 0; i < n; i++) {
            System.out.println("MỜi b nhập giá trị "+(i+1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        return arr;
    }

}
