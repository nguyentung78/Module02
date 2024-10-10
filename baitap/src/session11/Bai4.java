package session11;

import java.util.Arrays;
import java.util.Comparator;

public class Bai4 {
    public static void main(String[] args) {
        String[] arr={"A","F","E","VS","DG","HTR","ERV","SE","G"};
        System.out.println("mảng sắp xếp theo bảng chữ cái: ");
        Arrays.stream(arr).sorted().forEach(System.out::println);
    }
}
