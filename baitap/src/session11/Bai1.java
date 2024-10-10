package session11;

import java.util.Arrays;

public class Bai1 {
    public static void main(String[] args) {
        int[] arr = {2,6,2,8,2,73,5,8,3,8,2,9};
        System.out.println("số lớn nhất trong mảng là: "+ Arrays.stream(arr).max().getAsInt());
    }
}
