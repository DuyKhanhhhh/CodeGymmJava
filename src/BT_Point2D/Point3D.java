package BT_Point2D;

public class Point3D extends  Point2D{
    public float z = 0.0f;
    public float [] XYZ = new float[3];
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }
    public Point3D(){}

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.XYZ[0] = x;
        this.XYZ[1] = y;
        this.XYZ[2] = z;
    }

    public float[] getXYZ() {
        return XYZ;
    }
    @Override
    public String toString(){
        return "XYZ: " + getXYZ()
                + super.toString();
    }
}
