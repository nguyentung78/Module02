package session04.bai6;

public class Circle {
    // Thuộc tính private
    private double radius = 1.0;
    private String color = "red";

    // Hàm tạo không tham số
    public Circle() {
    }

    // Hàm tạo có tham số radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Phương thức public getRadius()
    public double getRadius() {
        return radius;
    }

    // Phương thức public getArea()
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
