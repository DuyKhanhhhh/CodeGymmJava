public class Circle {
    public int radius;

    public String color;

    public Circle() {
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor() {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}


