import java.util.Scanner;

public class Rectangle {
    double width , height;

    public Rectangle (){
    }

    public Rectangle (double white, double height){
        this.width = white;
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter (){
        return (this.width + this.height) * 2;
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
