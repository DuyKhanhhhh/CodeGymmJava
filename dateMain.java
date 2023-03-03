import java.util.Scanner;

public class dateMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day:");
        int day = scanner.nextInt();
        System.out.print("Enter the month:");
        int month = scanner.nextInt();
        System.out.print("Enter the year:");
        int year = scanner.nextInt();

        MyDate myDate = new MyDate(day, month, year);
        myDate.display();

    }
}
