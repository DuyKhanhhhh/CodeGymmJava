package oopTuan2;

import java.util.Scanner;

public class InHinhChuNhat {
    public static void main(String[] args) {
        int n , m;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(" * ");
            }
            System.out.println("   ");
        }

    }
}