package oopTuan1;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Hay Nhap Nam: ");
        year = scanner.nextInt();
        boolean isLeapYear = false;

        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    isLeapYear = true;
                }else {
                    isLeapYear = true;
                }
            }
        }
        if (isLeapYear){
            System.out.println(year + "Kh Phai Nam Nhuan");
        }else {
            System.out.println(year + "La Nam Nhuan");
        }
    }
}
