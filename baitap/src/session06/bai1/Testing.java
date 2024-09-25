package session06.bai1;

public class Testing {
    public static void main(String[] args) {
        Circle c = new Circle(3.5, "black");
        System.out.println(c);
        System.out.println("diện tích hình tròn là: "+ c.getDienTich());
        Cylinder cy = new Cylinder(4, "yelow", 5.5);
        System.out.println(cy);
        System.out.println("thể tích hình tròn là: "+ cy.getDienTich());
    }
}
