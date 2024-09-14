package session02;

import java.util.Scanner;

public class bai7 {
    public static void checkChanLe(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " là số chẵn.");
        } else {
            System.out.println(number + " là số lẻ.");
        }
    }
    public static boolean soNguyenTo(int number){
        if (number < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void checkchia3(int number) {
        if (number % 3 == 0) {
            System.out.println(number + " chia hết cho 3.");
        } else {
            System.out.println(number + " không chia hết cho 3.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int number;
        do{
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra 1 số có chia hết cho 3 hay ko");
            System.out.println("4. Thoát");
            System.out.println("nhập số muốn chọn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("nhập số để kiểm tra tính chẵn lẻ: ");
                    number = sc.nextInt();
                    checkChanLe(number);
                    break;
                case 2:
                    System.out.println("nhập số để kiểm tra số nguyên tố: ");
                    number = sc.nextInt();
                    if (soNguyenTo(number)) {
                        System.out.println(number + " là số nguyên tố.");
                    } else {
                        System.out.println(number + " ko phải là số nguyên tố.");
                    }
                    break;
                case 3:
                    System.out.println("nhập số để kiểm tra có chia hết cho 3 ko: ");
                    number = sc.nextInt();
                    checkchia3(number);
                    break;
                case 4:
                    System.out.println("thoát chương trình");
                    break;
                default:
                    System.out.println("nhập sai lựa chọn, vui lon chọn lại");
            }
        }
        while (choice != 4);
    }
}