package session03;
import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi thứ nhất: ");
        String str1 = scanner.nextLine();
        System.out.print("Nhập chuỗi thứ hai: ");
        String str2 = scanner.nextLine();
        String concatenatedString = str1.concat(str2);
        System.out.println("Chuỗi sau khi nối là: " + concatenatedString);
    }
}

