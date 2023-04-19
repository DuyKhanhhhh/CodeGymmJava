package BT_PointVaMovealePoint;

public class MovealePoint extends Point {
    public float xSpeed = 0.0f;
    public float ySpeed = 0.0f;
    public float []XYS = new float[2];
    public MovealePoint(){}

    public MovealePoint(float x, float y, float _x, float _y){
         super(x, y);
         this.xSpeed = _x;
         this.ySpeed = _y;
    }
    public MovealePoint(float _x, float _y){
         this.xSpeed = _x;
         this.ySpeed = _y;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getXYS() {
        return XYS;
    }

    public void SetSpeed(float [] XYS){
        this.XYS [0] = xSpeed;
        this.XYS [1] = ySpeed;
    }
    @Override
    public String toString(){
        return "xSpeed = " + getxSpeed()
                + " YSpeed = " + getySpeed()
                + super.toString();
    }
    public MovealePoint move(){
        xSpeed +=x;
        ySpeed += y;
        return this;
    }
}
