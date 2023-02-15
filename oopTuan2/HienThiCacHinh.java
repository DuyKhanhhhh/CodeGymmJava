package oopTuan2;

import java.util.Scanner;

public class HienThiCacHinh {
    public static void main(String[] args) {
        int choice = -1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Isosceles triangle");

        choice = scanner.nextInt();

        switch (choice){
            case 1:
                int white, height;
                white = 5;
                height = 8;
                for (int i = 0; i < white; i++){
                    for (int j = 0; j < height; j++){
                        System.out.print(" @ ");
                    }
                    System.out.println("  ");
            }
                break;
            case 2:
                for (int i = 1; i <= 5; i++){
                    for (int j = 1 ; j < i; j++){
                        System.out.print(" @ ");
                    }
                    System.out.println("  ");
                }
                break;
            case 3:
                for (int i = 7; i >= 1; i--){
                    for (int j = 1; j < i; j++){
                        System.out.print(" @ ");
                    }
                    System.out.println("  ");
                }
                break;
            case 4:
                System.out.println("Hay Nhap Gia Tri: ");
                Scanner sc = new Scanner(System.in);
                int number = sc.nextInt();
                int k = 0;
                for (int i = 1; i <= number; i++){
                    for (int j = 1; j <= 2 * number; j++){
                        System.out.print("  ");
                    }
                    while(k != 2 * i - 1){
                        System.out.print("* ");
                        ++k;
                    }
                    System.out.println();
                }
        }
    }
}
