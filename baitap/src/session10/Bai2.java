package session10;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Nhập vào số nguyên thứ nhất: ");
            int n1 = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập vào số nguyên thứ hai: ");
            int n2 = Integer.parseInt(sc.nextLine());
            int sum = n1+n2;
            System.out.println("tổng của 2 số là: "+sum);
        } catch (NumberFormatException nfe){
            System.out.println("Lỗi, vui lòng nhập vào giá trị số nguyên");
        }
    }
}
