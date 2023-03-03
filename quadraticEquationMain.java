import java.util.Scanner;

public class quadraticEquationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the c: ");
        double c = scanner.nextDouble();
        quadraticEquation quadraticEquation = new quadraticEquation(a , b , c);
        System.out.println("Ket qua phương trình delta ban đầu là: " + quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant() > 0){
            System.out.println("Nghiêm phương trình 1 là: " + quadraticEquation.getRoot1());
            System.out.println("Nghiêm phương trình 2 là: " + quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant()==0){
            System.out.println("Phương trình có nhiệm kép là: " + quadraticEquation.getRoot());
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
