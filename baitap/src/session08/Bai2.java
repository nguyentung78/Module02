package session08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai2 {
    public static void main(String[] args) {
        String chuoiMacDinh = "oooo sjewn cnsd vd ưevnsdnsdj uoo skjdvn e";
        String[] arrChuoi = chuoiMacDinh.split(" ");
        List<String> chuoiDs = new ArrayList<>(Arrays.asList(arrChuoi)); //tham số:
        System.out.println("các chuỗi có độ dài lớn hơn 3 kí tự là: ");
        for (String chuoi : chuoiDs) {
            if (chuoi.length() > 3) {
                System.out.println(chuoi);
            }
        }

    }
}
