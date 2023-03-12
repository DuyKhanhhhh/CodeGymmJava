package AdamVaEva;

public class Play {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Human Adam = new Human("Adam" , "Nam", 200);
        Human Eva = new Human("Eva" , "Nữ", 350);
        for (int i = 0 ; i < 5; i++){
            if (Adam.name.equals("Adam")){
                Adam.display();
                Adam.eatApple(apple);
                Adam.say("Adam");
            }else {
                Eva.display();
                Eva.eatApple(apple);
                Eva.say("Eva");
            }
        }
    }
}
