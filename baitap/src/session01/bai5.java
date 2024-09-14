package session01;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final float PI=3.14f;
        System.out.print("nhập vào bán kính đường tròn: ");
        float r=sc.nextFloat();
        float chuVi=2*PI*r;
        float S=PI*r*r;
        System.out.printf("Chu vi và diện tích đường tròn lần lượt là: %f và %f",chuVi,S);
    }
}