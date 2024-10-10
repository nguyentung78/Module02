package session11;

import java.util.Arrays;

public class Bai5 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,3,8,4,9,34};
        System.out.println("mảng số nguyên là: ");
        Arrays.stream(arr).forEach(System.out::println);
    }
}
