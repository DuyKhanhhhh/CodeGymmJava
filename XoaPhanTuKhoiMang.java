import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Số Cần Xóa: ");
        int index = scanner.nextInt();

        removeEleentInt(arrays, index);
    }

    private static void removeEleentInt(int[] arrays, int index){
        int sizeArrays = arrays.length - 1;
        int []newArryas = new int[sizeArrays];

        System.arraycopy(arrays, 0, newArryas, 0 , index);
        System.arraycopy(arrays, index + 1, newArryas, index , newArryas.length - index);

        for (int nunber : newArryas
             ) {
            System.out.println(nunber);
        }
    }
}