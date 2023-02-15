package oopTuan2;

import java.util.Scanner;

public class HienThiSoNguyen {
    public static void main(String[] args) {
        System.out.print("2 ");
        int status = 1;
        int count = 3;
        for (int i = 2; i <=20; ){
            for (int j = 2; j <= Math.sqrt(count); j++){
                if (count % j == 0){
                    status = 0;
                    break;
                }
            }
            if (status != 0){
                System.out.print(count + " ");
                i++;
            }
            status = 1;
            count ++;
        }
    }
}
