package BT_LopCircleVaLopCylinder;

public class Cylinder extends Circle{
    public double height;
    public Cylinder(){

    }
    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
    @Override
    public String toString(){
        return "Chiều cao: " + getHeight()
                + super.toString()
                + " Thể Tích: "
                + volume();
    }
}
