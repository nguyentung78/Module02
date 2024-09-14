package session02;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số bắt đầu của khoảng: ");
        int startNumber = Integer.parseInt(sc.nextLine());
        System.out.println("nhập vào số kết thúc của khoảng: ");
        int endNumber = Integer.parseInt(sc.nextLine());
        int sum=0;
        for (int i = startNumber; i <= endNumber; i++) {
            if (i % 2 == 0) {
                sum+=i;
            }
        }
        System.out.println("tổng các số chẵn nằm trong khoảng trên là: "+sum);
    }
}
