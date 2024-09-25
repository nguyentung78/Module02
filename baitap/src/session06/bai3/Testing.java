package session06.bai3;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào cạnh 1: ");
        double side1 = Double.parseDouble(sc.nextLine());
        System.out.println("nhập vào cạnh 2: ");
        double side2 = Double.parseDouble(sc.nextLine());
        System.out.println("nhập vào cạnh 3: ");
        double side3 = Double.parseDouble(sc.nextLine());
        System.out.println("nhập vào màu sắc: ");
        String color= sc.nextLine();
        Triangle tri = new Triangle(side1, side2, side3);
        tri.setColor(color);
        System.out.println("các thng số của tam giác: 1.màu sắc: "+tri.getColor()+ "; 2.diện tích: "+tri.getDientich()+ "; 3.chu vi: "+tri.getChuvi());
    }
}
