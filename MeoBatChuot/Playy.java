package MeoBatChuot;

public class Playy {
    public static void main(String[] args) {
        Cat cat = new Cat("Mèo Nguu" , 200 , 100);
        Rat rat = new Rat("Chuột ngu" , 300, 40 ,true);
        rat.sayRat();
        cat.catchTheMouse(rat);
        cat.sayCat();
        cat.eatRat(rat);
    }
}
