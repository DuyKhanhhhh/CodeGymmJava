import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
       int []array1 = {2, 1, 2 ,3 ,4};
       int []array2 = {3 , 5 ,6, 1};

       mergeArray(array1, array2);
    }
    private static void mergeArray(int [] array1, int [] array2){
        int sizeArray = array1.length + array2.length;
        int[] newArray = new int [sizeArray];

        System.arraycopy(array1, 0, newArray, 0, array1.length);
        System.arraycopy(array2, 0 , newArray, array1.length , array2.length);

        for (int number: newArray
             ) {
            System.out.println(number);
        }
    }

}
