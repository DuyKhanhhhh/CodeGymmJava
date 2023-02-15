package oopTuan1;

import java.util.Scanner;

public class ChuyenChuThanhSo {
    public static void main(String[] args) {
        System.out.println("Hãy Nhập Số: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number <=0){
            System.out.println("Kh hỗ trợ!");
        }
        switch (number / 100){
            case 1 :
                System.out.print("one hundred ");
                break;
            case 2:
                System.out.print("two hundred ");
                break;
            case 3:
                System.out.print("Three hundred ");
                break;
            case 4:
                System.out.print("Four hundred ");
                break;
            case 5:
                System.out.print("Five hundred ");
                break;
            case 6:
                System.out.print("Six hundred ");
                break;
            case 7:
                System.out.print("Seven hundred ");
                break;
            case 8:
                System.out.print("Eight hundred ");
                break;
            case 9:
                System.out.print("Nine hundred ");
                break;
        }
        switch (number){
            case 1 :
                System.out.print("one ");
                break;
            case 2:
                System.out.print("two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;
            case 10:
                System.out.print("ten ");
                break;
            case 11:
                System.out.print("Eleven ");
                break;
            case 12:
                System.out.print("Twelve ");
                break;
            case 13:
                System.out.print("Thirteen ");
                break;
            case 14:
                System.out.print("Fourteen ");
                break;
            case 15:
                System.out.print("Fifteen ");
                break;
            case 16:
                System.out.print("Sixteen ");
                break;
            case 17:
                System.out.print("Seventeen ");
                break;
            case 18:
                System.out.print("Eighteen ");
                break;
            case 19:
                System.out.print("Nineteen ");
                break;
        }
        switch ((number/10)%10){
            case 2:
                System.out.print("Twenty ");
                break;
            case 3:
                System.out.print("Thirty ");
                break;
            case 4:
                System.out.print("Forty ");
                break;
            case 5:
                System.out.print("Fifty ");
                break;
            case 6:
                System.out.print("Sixty ");
                break;
            case 7:
                System.out.print("Seventy ");
                break;
            case 8:
                System.out.print("Eighty ");
                break;
            case 9:
                System.out.print("Ninety ");
                break;
        }
        if ((number/10)%10==1){

        }else{
            switch (number % 10){
                case 1 :
                    System.out.print("one ");
                    break;
                case 2:
                    System.out.print("two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
        }
    }
}
