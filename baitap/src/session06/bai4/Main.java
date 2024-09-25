package session06.bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử của mảng 1 (số nguyên): ");
        int n = sc.nextInt();
        int[] intArr=new int[n];
        System.out.println("nhập vào các phần tử của mảng 1: ");
        for (int i = 0; i < n; i++) {
            intArr[i]=sc.nextInt();
        }
        int sumInt=ArrayCalculator.sumOfArray(intArr);
        System.out.println("Tổng của mảng số nguyên là "+sumInt);

        System.out.println("Nhập vào số lượng phần tử của mảng 2 (số thực): ");
        int d = sc.nextInt();
        double[] doubleArr=new double[d];
        System.out.println("nhập vào các phần tử của mảng 2: ");
        for (int i = 0; i < d; i++) {
            doubleArr[i]=sc.nextDouble();
        }
        double sumDouble=ArrayCalculator.sumOfArray(doubleArr);
        System.out.println("Tổng của mảng số thực là "+sumDouble);
    }
}
