package oopTuan2;

import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        double money = 1.0;
        int moth = 1;
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập Số Tiền Vay: ");
        money = scanner.nextDouble();

        System.out.println("Nhập Số Tháng: ");
        moth = scanner.nextInt();

        System.out.println("Nhập Số Tiền Lãi: ");
        interestRate = scanner.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < moth; i++);
        totalInterest += money * (interestRate / 100) / 12 * moth;

        System.out.println("Lai suất: " + totalInterest);
    }
}
