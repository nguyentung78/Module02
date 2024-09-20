package session01;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final float DOLA_MI = 24000;
        System.out.println("xin mời nhập giá trị tiền USD: ");
        double money = sc.nextDouble();
        double sum = DOLA_MI * money;
        System.out.println("giá trị sau khi đổi ra VNĐ là: "+sum);
    }
}