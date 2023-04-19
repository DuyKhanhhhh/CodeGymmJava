package BT_Point2D;

public class test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1.0F, 2.2F);
        point2D.setXY(2.0F, 3.1F);
        System.out.println(point2D);
        Point3D point3D = new Point3D(2.0F, 3.0F, 3.3F);
        System.out.println(point3D);
    }
}
