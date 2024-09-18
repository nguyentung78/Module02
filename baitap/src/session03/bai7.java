package session03;
import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi chính: ");
        String chuoiChinh = scanner.nextLine();
        System.out.print("Nhập chuỗi con cần kiểm tra: ");
        String chuoiCon = scanner.nextLine();
        if (chuoiChinh.contains(chuoiCon)) {
            System.out.println("Chuỗi chính có chứa chuỗi con.");
        } else {
            System.out.println("Chuỗi chính không chứa chuỗi con.");
        }
    }
}

