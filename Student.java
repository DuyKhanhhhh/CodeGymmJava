public class Student {
    int rollno;
    String name;
    String college = "BachKhoa";
    Student (int r , String n){
        rollno = r;
        name = n;
    }
    void  display(){
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Thanh");
        Student s3 = new Student(333, "Nam");
        s1.display();
        s2.display();
        s3.display();
    }
}

