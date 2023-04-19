package TH_TaoLopDongVat;

public class Cat extends  Animal {
    public double age;
    public Cat(){
        super();
        age = 0.1;
    }
    public Cat(double age){
        super();
        this.age = age;
    }
    public Cat(double weight, double height, double age){
        super(weight, height);
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "A Cat with age: " + getAge()
                + " which is a subclass of: " + super.toString();
    }
}
