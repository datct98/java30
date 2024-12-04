package lesson4_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Mời b nhập số nguyên N:");
        int n =Integer.parseInt(scanner.nextLine());
        //
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Mời b nhập số thứ "+(i+1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"\t");
        }

        // Tăng các số chẵn lên 1 dv
        for (int i = 0; i < n; i++) {
            if(arr[i] %2 ==0){
                arr[i]= arr[i] +1;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"\t");
        }*/
        //int row= 3, column = 2;
        // Nhập số dòng và số cột của ma trận A
        System.out.println("Mời b nhập vào số dòng A: ");
        int rowA = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời b nhập vào số cột A: ");
        int columnA = Integer.parseInt(scanner.nextLine());

        // Nhập số dòng và số cột của ma trận B
        System.out.println("Mời b nhập vào số dòng B: ");
        int rowB = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời b nhập vào số cột B: ");
        int columnB = Integer.parseInt(scanner.nextLine());

        if(rowA!=rowB || columnA != columnB){
            System.out.println("Số dòng hoặc số cột của 2 ma trận khoogn bằng nhau");
        } else {
            int [][] arrA = inputMatrix(scanner, rowA, columnA);
            int [][] arrB= inputMatrix(scanner, rowB, columnB);
        /*for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Mời b nhập arr["+i+"]"+"["+j+"]");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        // Calculate sum
        int sum=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if( arr[i][j]%3 ==0)
                    sum+= arr[i][j];
            }
        }
        System.out.println("Sum ="+sum);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }*/
            // Nhập mảng A


            // Nhập mảng B
            for (int i = 0; i < rowB; i++) {
                for (int j = 0; j < columnB; j++) {
                    System.out.println("Mời b nhập giá trị b["+i+"]["+j+"]");
                    arrB[i][j] = Integer.parseInt(scanner.nextLine());
                }
            }

            // Tổng 2 ma trận
            int [][] arrC= new int[rowA][columnA];
            for (int i = 0; i < rowB; i++) {
                for (int j = 0; j < columnB; j++) {
                    arrC[i][j]= arrA[i][j] + arrB[i][j];
                }
            }

            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    System.out.print(arrC[i][j]+"\t");
                }
                System.out.println();
            }
        }

    }

    public static int [][]inputMatrix(Scanner scanner, int row, int column){
        int arr [][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Mời b nhập giá trị a["+i+"]["+j+"]");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        return arr;
    }
}
