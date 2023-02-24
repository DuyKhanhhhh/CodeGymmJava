import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 6, 4, 5};
        System.out.println("Dẫy Số:");
        for (int render : array
        ) {
            System.out.print(" " + render );
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số cần thêm : ");
        int value = scanner.nextInt();

        System.out.print("Nhập vào vị trí cần thêm : ");
        int index = scanner.nextInt();

        addElement (array, value , index);

    }
    private static void addElement (int[] arrays, int value ,int index ){
        int sizeArray = arrays.length + 1;
        int []newArray = new int[sizeArray];

        System.arraycopy(arrays, 0, newArray, 0, index );
        newArray[index]=value;
        System.arraycopy(arrays, index , newArray, index + 1 , newArray.length - index -1);

        for (int number : newArray
             ) {
            System.out.print(number + " ");
        }
    }
}
