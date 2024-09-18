package session03;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng phần tử của mảng: ");
        int numbers = Integer.parseInt(sc.nextLine());
        int[] array = new int[numbers];
        System.out.println("nhập vào từng phần tử của mảng");
        for (int i = 0; i < numbers; i++) {
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("mảng vừa nhập là: ");
        for (int i = 0; i < numbers; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        int min = array[0];
        int minIndex = 0;
        for (int i = 1; i < numbers; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("phần tử nhỏ nhất của mảng là: "+min);
    }
}
