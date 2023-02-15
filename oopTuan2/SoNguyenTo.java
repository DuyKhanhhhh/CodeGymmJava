package oopTuan2;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay Nhap So: ");
        int number = scanner.nextInt();

        if (number < 2){
            System.out.println(number + " Khong Phai So Nguyen To");
        }else{
            int i  = 2;
            boolean check = true;
            while (i < number){
                if (number % i == 0){
                check = false;
                break;
                }
                i++;
            }
            if (check){
                System.out.println(number + " Là Số Nguyên Tố");
            }else {
                System.out.println(number + " Không phải là số Nguyên Tố ");
            }
        }
    }
}
