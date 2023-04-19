package TH_TaoLopConVaNgKeThua;

public class test {
    public static void main(String[] args) {
        People people = new People();
        System.out.println(people);
        System.out.println("------------------------");
        Student student = new Student();
        System.out.println(student);
        System.out.println("------------------------");
        Student student1 = new Student("a" , 10, false, "IBSK1D2");
        System.out.println(student1);
        Employee employee = new Employee();
        System.out.println(employee);
        System.out.println("--------------------------------");
        employee = new Employee("Nguyen Thi A", 21, true, "FPT");
        System.out.println(employee);
        System.out.println("--------------------------------");
        employee.work();
        employee.setEnterprise("Viettel");
        System.out.println(employee);

    }

}
