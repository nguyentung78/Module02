package session10;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        try {
            System.out.print("Nhập số lượng phần tử của mảng: ");
            n = Integer.parseInt(sc.nextLine());

            if (n == 0) {
                throw new Exception("Mảng không có phần tử nào.");
            }
        } catch (NumberFormatException nfe) {
            System.err.println("Lỗi: Dữ liệu nhập vào không phải là số nguyên.");
            return;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return;
        }

        int[] array = new int[n];
        try {
            System.out.println("Nhập các phần tử của mảng: ");
            for (int i = 0; i < n; i++) {
                System.out.print("Phần tử thứ " + (i + 1) + ": ");
                array[i] = Integer.parseInt(sc.nextLine());
            }
        } catch (NumberFormatException nfe) {
            System.err.println("Lỗi: Bạn đã nhập không phải là số nguyên.");
            return;
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng là: " + max);
        sc.close();
    }
}

