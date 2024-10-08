package session10;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            try{
                System.out.println("Nhập vào số nguyên thứ nhất: ");
                int n1 = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập vào số nguyên thứ hai: ");
                int n2 = Integer.parseInt(sc.nextLine());
                float div = n1/n2;
                System.out.println("kết quả của phép chia là: "+div);
            } catch (NumberFormatException nfe) {
                System.err.println("Lỗi định dạng dữ liệu đầu vào, mời bạn chạy lại chương trình");
            } catch (ArithmeticException ae) {
                System.err.println("Lỗi chia cho 0, mời bạn chạy lại chương trình");
            } catch (Exception ex) {
                System.out.println("Chương trình bị lỗi: " + ex.getMessage());
                System.out.println("Mời bạn chạy lại chương trình");
            } finally {
                System.out.println("CHƯƠNG TRÌNH KẾT THÚC");
            }
            break;
        } while (true);

    }
}