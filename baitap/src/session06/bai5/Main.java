package session06.bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số lượng phần tử mảng số nguyên: ");
        int n = sc.nextInt();
        int[] intArray = new int[n];
        System.out.println("nhập vào các phần tử của mảng số nguyên: ");
        for (int i = 0; i < n; i++) {
            intArray[i] = sc.nextInt();
        }
        int maxInt = ArrayCalculator.maxOfArray(intArray);
        int minInt = ArrayCalculator.minOfArray(intArray);
        System.out.println("Giá trị lớn nhất của mảng số nguyên là: " + maxInt);
        System.out.println("Giá trị nhỏ nhất của mảng số nguyên là: " + minInt);

        // Kiểm thử với mảng số thực (double)
        System.out.println("\nNhập số lượng phần tử của mảng số thực: ");
        int m = sc.nextInt();
        double[] doubleArray = new double[m];

        System.out.println("Nhập các phần tử của mảng số thực:");
        for (int i = 0; i < m; i++) {
            doubleArray[i] = sc.nextDouble();
        }

        double maxDouble = ArrayCalculator.maxOfArray(doubleArray);
        double minDouble = ArrayCalculator.minOfArray(doubleArray);
        System.out.println("Giá trị lớn nhất của mảng số thực là: " + maxDouble);
        System.out.println("Giá trị nhỏ nhất của mảng số thực là: " + minDouble);
    }
}
