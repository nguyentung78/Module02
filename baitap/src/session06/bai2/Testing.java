package session06.bai2;

import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
        Point2D p2d = new Point2D(5.2f, 4.5f);
        System.out.println(p2d);
        p2d.setXY(4.0f, 5.0f);
        System.out.println("update"+p2d);
        System.out.println(Arrays.toString(p2d.getXY()));

        Point3D p3d = new Point3D(5.0f, 4.0f, 6.0f);
        System.out.println(p3d);
        p3d.setXYZ(4.0f, 5.0f, 4.1f);
        System.out.println("update"+p3d);
        System.out.println(Arrays.toString(p3d.getXYZ()));
    }

}
