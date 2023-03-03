import java.util.Scanner;

public class rectanglePrintMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lenght: ");
        int length = scanner.nextInt();
        System.out.print("Enter the width: ");
        int width = scanner.nextInt();
        rectanglePrint rectanglePrint = new rectanglePrint(length, width);
        for (int i = 0; i <= rectanglePrint.getArea(); i++){
            for (int j = 0 ; j<= rectanglePrint.getPerimeter(); j++){
                System.out.print(" * ");
            }
            System.out.println("  ");
        }
    }
}
