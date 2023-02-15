package oopTuan1;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap So Thang: ");
        int moth = scanner.nextInt();

        switch (moth){
            case 2:
                System.out.println("The moth '2' has 28 or 29 day!");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("The month '" + moth + "' has 31 days!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("The month '" + moth + "' has 30 days!");
                break;
        }

    }
}
