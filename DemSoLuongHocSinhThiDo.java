import java.util.Scanner;

public class DemSoLuongHocSinhThiDo {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Hãy nhập siza của mảng: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.print("Độ dài mảng không quá 30 ");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập điểm học sinh " + (i + 1) + ": ");
            array [i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("\n Danh sách đánh dấu: ");
        for (int j = 0; j < array.length; j++){
            System.out.println(array[j] + "\t");
            if (array[j] >= 5 && array [j] <= 10){
                count++;
            }
        }
        System.out.println("\n Số học sinh đạt là: " + count);
    }
}