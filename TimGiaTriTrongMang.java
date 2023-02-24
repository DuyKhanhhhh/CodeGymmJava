import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        //Khai Báo Biến
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's student: ");
        String input_name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++ ){
            if (students[i].equals(input_name)){ //.equals kiểm tra hai mảng xem giống nhau kh rồi chả về true hoặc false
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                isExist = true;
                break;
            }
        }
    if (!isExist){
        System.out.println("Not found" + input_name + " in the list.");
    }

    }
}
