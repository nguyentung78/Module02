package session03;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=10;
        int[] arr={10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        System.out.println("nhập số cần chèn: ");
        int X = Integer.parseInt(sc.nextLine());
        System.out.println("nhập vị trí index cần chèn: ");
        int index = Integer.parseInt(sc.nextLine());
        if (index<=-1 && index >= arr.length-1) {
            System.out.println("không chèn được phần tử vào mảng");
        } else {
            for (int i = N-1; i > index; i--) {
                arr[i] = arr[i-1];
            }
            arr[index] = X;
        }
        System.out.println("Mảng sau khi chèn là: ");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
