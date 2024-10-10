package session11;

import java.util.Arrays;

public class Bai3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,3,8,4,9,34};
        int sum = Arrays.stream(arr).reduce(0,(total, n)->total+n);

        System.out.println("Tổng các phần tử trong mảng là: "+sum);
    }
}
