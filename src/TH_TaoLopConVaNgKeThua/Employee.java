package TH_TaoLopConVaNgKeThua;

public class Employee extends People{
    public String enterprise;
    public Employee (){
        super();
        enterprise = "CodeGym";
    }
    public Employee(String enterprise){
        super();
        this.enterprise = enterprise;
    }
    public Employee(String name, int age, boolean gender, String enterprise){
        super(name, age, gender);
        this.enterprise = enterprise;
    }
    public String getEnterprise() {
        return enterprise;
    }
    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }
    public void work(){
        System.out.println("Làm việc");
    }
    @Override
    public String toString(){
        return "A Employee work at enterprise: " + enterprise
                + "\n" + "which is a subclass of : " + super.toString();
    }
}
