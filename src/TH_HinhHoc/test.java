package TH_HinhHoc;

public class test {
    public static void main(String[] args) {
        Shapee shapee = new Shapee();
        System.out.println(shapee);

        Shapee shapee1 = new Shapee("red", false);
        System.out.println(shapee1);

        System.out.println("----------------------------");

        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle("blue", true, 2.0);
        System.out.println(circle1);

        Circle circle2 = new Circle(3.5);
        System.out.println(circle2);

        System.out.println("----------------------------");

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("Black", false, 2.4, 1.2);
        System.out.println(rectangle);
    }
}
