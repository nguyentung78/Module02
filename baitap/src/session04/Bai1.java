package session04;

import java.util.Scanner;

public class Bai1 {
        private float r;
        private String color;
        public static final float PI = 3.14F;
        public Bai1() {
        }

        public Bai1(float r, String color) {
            this.r = r;
            this.color = color;
        }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float chuVi() {
            return 2*PI*r;
    }

    public float dienTich() {
            return PI*r*r;
    }

    public void inputData(Scanner sc) {
        System.out.println("nhập vào bán kính đường tròn: ");
        this.r = Float.parseFloat(sc.nextLine());
        System.out.println("nhập vào màu sắc: ");
        this.color = sc.nextLine();
    }

    public void displayData(){
        System.out.printf("bán kính hình tròn: %f, màu sắc: %s, chu vi hình tròn = %f, diện tích hình tròn = %f", this.r, this.color, this.chuVi(), this.dienTich());
    }

    public static void main(String[] args) {
        Bai1 hinhTron = new Bai1();
        hinhTron.inputData(new Scanner(System.in));
        hinhTron.displayData();

    }
}
