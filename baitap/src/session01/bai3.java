package session01;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao cạnh hình vuông: ");
        float canh = sc.nextFloat();
        float chuVi = canh*4, S=canh*canh;
        System.out.printf("chu vi và diện tích hình vuong lần lượt là: %f và %f", chuVi, S);
    }

}