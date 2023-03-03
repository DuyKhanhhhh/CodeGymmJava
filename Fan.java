public class Fan {
    public final int Slow = 1;
    public final int Medium = 2;
    public final int Fast = 3;
    public int speed = 1;
    public boolean on = false;
    public double radius = 5;
    public String color = "blue";

    public int getSlow() {
        return Slow;
    }
    public int getMedium(){
        return Medium;
    }
    public int getFast() {
        return Fast;
    }
    public int getSpeed(){
        return speed;
    }
    public boolean isOn(){
        return on;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public Fan (int speed, double radius, String color){
        this.color = color;
        this.speed = speed;
        this.radius = radius;
//        this.on = on;
    }
    public String toString(){
        String start= "";
        if (this.on){
            start += ("Fan is on \n");
            start += ("Speed: " + this.speed + "\n");
        }else {
            start += "Fan is off";
        }
        start += "Color: " + this.color + "\n";
        start += "Radius: " + this.radius + "\n";
        return start;
    }
}

