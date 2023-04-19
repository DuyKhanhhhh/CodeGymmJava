package TH_TaoLopConVaNgKeThua;

public class People {
    public String name;
    public boolean gender;
    public int age;
    public People(){
        name = "Tên Mặc Đinh";
        age = 0;
        gender = false;
    }
    public People(String name, int age, boolean gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public void eat(){
        System.out.println("Đang ăn");
    }
    public void sleep(){
        System.out.println("Ngủ");
    }

    @Override
    public String toString(){
        return "Người có tên: " + getName() +
                "\n" + "Có Tuổi: " + getAge() +
                "\n" + "Giới tính: " + (isGender() ? "Nam": "Nữ");
    }
}
