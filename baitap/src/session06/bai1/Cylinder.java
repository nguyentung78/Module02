package session06.bai1;

public class Cylinder extends Circle {
    private double h;
    public Cylinder(){
        super();
    }
    public Cylinder(double r, String color, double h){
        super(r, color);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getTheTich() {
        return getDienTich() * h;
    }
    public String toString(){
        return "Cylinder [radius= "+getR()+ ", height= "+getH()+ ", color= "+getColor()+"]";
    }
}
