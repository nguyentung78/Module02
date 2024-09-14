package session02;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số tự nhiên: ");
        int number = Integer.parseInt(sc.nextLine());
        if (number%3==0&&number%5==0) {
            System.out.println(number+" là số chia hết cho 3 và 5");
        } else {
            System.out.println(number+" là số không chia hết cho 3 và 5");
        }
    }
}
