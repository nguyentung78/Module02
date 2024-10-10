package session11;

import java.util.Arrays;

public class Bai6 {
    public static void main(String[] args) {
        String[] arr = {"sfef","seee","dscjns"};
        System.out.println("chuyển đổi thành mảng chuỗi in hoa: ");
        Arrays.stream(arr).map(String::toUpperCase).forEach(System.out::println);
    }
}
