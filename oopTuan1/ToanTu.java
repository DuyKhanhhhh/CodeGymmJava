package oopTuan1;

import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chieu rong: ");
        width = scanner.nextFloat();

        System.out.println("Nhap Chieu Rai: ");
        height = scanner.nextFloat();

        float area = width * height;

        System.out.println("Area is: " + area);
    }
}
