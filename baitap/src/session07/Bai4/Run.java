package session07.Bai4;

public class Run {
    public static void main(String[] args) {
        Circle circle = new Circle("red", 5);
        Rectangle rectangle = new Rectangle("yellow", 4,5);
        circle.displayData();
        System.out.println("diện tích hình tròn: "+circle.getArea());
        rectangle.displayData();
        System.out.println("diện tích hình chữ nhật:"+rectangle.getArea());
    }
}
