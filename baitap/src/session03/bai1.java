package session03;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Nhập vào các ptu của mảng ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("mảng trước khi xóa ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("nhập vào phần tử cần xóa ");
        int valueRemote = Integer.parseInt(sc.nextLine());
        boolean find = false;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (valueRemote == arr[i]) {
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                n--;
                find = true;
                break;
            }
        }
        int[] newArr = new int[arr.length];
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }
        newArr[n]=0;
        System.out.printf("Mảng sau khi xóa phần tử %d là: ", valueRemote);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}