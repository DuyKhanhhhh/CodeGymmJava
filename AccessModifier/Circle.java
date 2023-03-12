package AccessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";
    public Circle (double radius, String color ){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
}
