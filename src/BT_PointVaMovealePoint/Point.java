package BT_PointVaMovealePoint;

public class Point {
    public float x = 0.0f;
    public float y = 0.0f;
    public float []XY = new float[2];

    public Point(){
    }
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public float[] getXY() {
        return XY;
    }

    public void setXY(float [] XY) {
        this.XY [0] = x;
        this.XY [1] = y;
    }
    @Override
    public String toString(){
        return "X: " + getX()
                + " Y: " + getY();
    }
}
