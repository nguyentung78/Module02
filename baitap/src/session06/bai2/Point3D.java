package session06.bai2;

import java.awt.*;

public class Point3D extends Point2D {
    private float z = 0.0F;
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D(){
        super();
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}
