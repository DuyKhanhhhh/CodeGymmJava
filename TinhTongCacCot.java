import java.util.Scanner;

public class TinhTongCacCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[5][5];

        for (int row = 0; row < array.length; row++) {
            for (int colum = 0; colum < array.length; colum++) {
                array[row][colum] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Show Array");
        for (int row = 0; row < array.length; row++) {
            for (int colum = 0; colum < array[row].length; colum++) {
                System.out.print(array[row][colum] + "\t");
            }
            System.out.println();
        }
//        System.out.println("Hãy nhập số cột cần tỉnh tổng: ");
//        int inColum = scanner.nextInt();
        System.out.println("Tổng các cột là: ");

        for (int column = 0; column < array[0].length; column++) {
            int total = 0;
            for (int row = 0; row < array.length; row++)
                total += array[row][column];
            System.out.println("Tổng cột " + column + " là " + total);
        }
    }
}
