package session09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(5);
        list.add(24);
        list.add(3);
        list.add(7);
        list.add(92);
        list.add(83);
        System.out.println("List số nguyên là: "+list);
        int max = Collections.max(list);
        System.out.println("phần tử lớn nhất trong mảng là: "+max);
    }
}
