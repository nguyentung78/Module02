package session04.bai6;

public class TestCircle {
    public static void main(String[] args) {
        // Tạo đối tượng Circle sử dụng hàm tạo không tham số
        Circle c1 = new Circle();
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Area: " + c1.getArea());

        // Tạo đối tượng Circle sử dụng hàm tạo có tham số
        Circle c2 = new Circle(2.5);
        System.out.println("Radius: " + c2.getRadius());
        System.out.println("Area: " + c2.getArea());
    }
}
