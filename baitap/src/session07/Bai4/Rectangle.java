package session07.Bai4;

public class Rectangle extends Shape{
    private float width;
    private float height;
    public Rectangle(String color, float width, float height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }
}
