import java.util.Scanner;

public class fanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Speed: ");
        int speed = scanner.nextInt();
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the color: ");
        String color = scanner.next();
        Fan fan = new Fan(speed,radius, color);
    }
}
