package oopTuan1;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
    int USD;
    int kq;
        System.out.println("Hay Nhap So Tien: ");
        Scanner scanner = new Scanner(System.in);
        USD = scanner.nextInt();

        kq = USD * 23000;
        System.out.println("Số Tiền: " + kq);
    }
}
