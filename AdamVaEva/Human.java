package AdamVaEva;

public class Human {
    String name;
    String gender;
    int weight;
    Human(String name, String gender, int weight){
        this.name = name;
        this.gender = gender;
        this.weight = weight;
    }
    public void say(String name){
        if (this.name.equals("Adam")){
            System.out.println("Đớp đi em");
        }else {
            System.out.println("Em đớp đây");
        }
    }
    public void eatApple(Apple apple){
        if (apple.weigh > 0){
            apple.decrease();
            this.weight ++;
        }else{
            System.out.println("Còn cái nịt");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        System.out.println(this.name + " Ăn Táo" + "\n"+ "Giới tính " + this.gender + "\n" + "Cân Nặng " + this.weight );
    }
}
