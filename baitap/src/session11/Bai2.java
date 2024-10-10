package session11;

import java.util.Arrays;

public class Bai2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,8,3,7,2,5,3,5,2,4,44,98};
        System.out.println("các số chẵn có trong mảng là: ");
        Arrays.stream(arr).filter(n->n%2==0).forEach(System.out::println);
    }
}
