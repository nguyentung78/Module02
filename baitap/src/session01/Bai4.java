package session01;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào điểm Toán: ");
        float toan = sc.nextFloat();
        System.out.print("nhập vào điểm Văn: ");
        float van = sc.nextFloat();
        System.out.print("nhập vào điểm Anh: ");
        float anh = sc.nextFloat();
        float TB = (toan + van + anh) / 3;
        System.out.print("Điểm trung bình 3 môn Toán Văn Anh là: "+TB);
    }
}