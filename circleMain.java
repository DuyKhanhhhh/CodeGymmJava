import java.util.Scanner;

public class circleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter in radius: ");
        int radius = scanner.nextInt();
        Circle circle = new Circle();
        circle.setRadius(radius);
        System.out.println(circle.getArea());
    }
}
