package session09;

import java.util.ArrayList;
import java.util.List;

public class Bai3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int[] sum = {0};
        list.forEach(number -> sum[0] += number);
        System.out.println("Tổng của các phần tử la: "+sum[0]);
    }
}
