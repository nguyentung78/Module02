package session10;

import java.util.Date;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào ngày: ");
        int ngay = Integer.parseInt(sc.nextLine());
        System.out.println("nhập vào tháng: ");
        int thang = Integer.parseInt(sc.nextLine());
        System.out.println("nhập vào năm: ");
        int nam = Integer.parseInt(sc.nextLine());
        try{
            if (isValidate(ngay, thang, nam)){
                System.out.println("hợp lệ");
            } else {
                throw new Exception("Ngày tháng năm ko hợp lệ");
            }
        } catch (Exception e) {
            System.err.println("lỗi: "+e.getMessage());
        }
        sc.close();
    }
    public static boolean isValidate(int ngay, int thang, int nam) {
        if(thang<0 || ngay<0 || nam<0){
            return false;
        }
        int[] daysInMonth = { 31, isLeapYear(nam) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        return ngay >=1 && ngay<=daysInMonth[thang-1];
    }
    public static boolean isLeapYear(int year) {
        return year%4==0 && year%100!=0 || year%400==0;
    }
}
