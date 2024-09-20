package session04;

import java.util.Scanner;

public class Bai3 {
    private double a;
    private double b;
    private double c;

    public Bai3() {

    }
    public Bai3(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        return b*b - 4*a*c;
    }

    public double getRoot1(){
        double delta = getDiscriminant();
        if (delta >= 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            return root1;
        } else {
            return Double.NaN;
        }
    }
    public double getRoot2(){
        double delta = getDiscriminant();
        if (delta >= 0) {
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return root2;
        } else {
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("nhập vào số b: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("nhập vào số c: ");
        double c = Double.parseDouble(sc.nextLine());
        Bai3 daidien  = new Bai3(a,b,c);
        double delta = daidien.getDiscriminant();
        if (delta == 0) {
            System.out.println("phương trình có 1 nghiệm kép duy nhất x1=x2= " + daidien.getRoot1());
        } else if (delta > 0) {
            System.out.print("phương trình có 2 nghiệm phân biệt x1="+ daidien.getRoot1()+" và x2= " + daidien.getRoot2());
        } else {
            System.out.println("phương trình vô nghiệm.");
        }
    }
}
