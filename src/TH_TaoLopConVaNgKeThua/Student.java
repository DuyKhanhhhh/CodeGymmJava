package TH_TaoLopConVaNgKeThua;

public class Student extends People {
    public String className;
    public Student(){
        super();
        className = "D101_C2K14";
    }
    public Student(String className){
        this.className = className;
    }
    public Student(String name, int age, boolean gender, String className ){
        super(name, age, gender);
        this.className = className;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public void study(){
        System.out.println("Học tập");
    }
    @Override
    public String toString(){
        return  "A Student with class name: " + getClassName() +
                "\n" + "Which is a subclass of: " + "\n" + super.toString();
    }
}
