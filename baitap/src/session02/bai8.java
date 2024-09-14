package session02;

import java.util.Scanner;

public class bai8 {
    public static boolean check(float a, float b, float c){
        return (a+b>c) && (a+c>b) && (b+c>a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        while (true){
            System.out.print("Nhập cạnh a: ");
            a = sc.nextFloat();
            System.out.print("Nhập cạnh b: ");
            b = sc.nextFloat();
            System.out.print("Nhập cạnh c: ");
            c = sc.nextFloat();
            if (check(a,b,c)){
                double chuVi = a+b+c;
                double p = (a+b+c)/2;
                double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                System.out.println("chu vi và diện tích hình tam giác lần lượt là: "+chuVi+" và "+S);
                break;
            }else {
                System.out.println("các cạnh tam giác không hợp lệ, hãy nhập lại");
            }
        }

    }
}