package oopTuan1;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Linner Equation Resolver");
        System.out.println("Given a equations ' a * x + b = c', please enter constans: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c" );
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        }else{
            if (b == c){
                System.out.println("The solution all xl");
            }else{
                System.out.println("No solution!");
            }
        }


    }
}
