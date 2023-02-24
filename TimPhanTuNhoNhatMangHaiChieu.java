public class TimPhanTuNhoNhatMangHaiChieu {
    public static void main(String[] args) {
        int[][] array = new int[6][6];
        int max = array[0][0];

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

        for (int row = 0; row < array.length; row++) {
            for (int colum = 0; colum < array[row].length; colum++) {
                if (max > array[row][colum]) {
                    max = array[row][colum];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }
}
