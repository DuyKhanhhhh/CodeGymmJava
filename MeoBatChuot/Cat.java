package MeoBatChuot;

public class Cat {
    public String nameCat;
    public int weightCat;
    public int speedCat;

    public Cat (String nameCat, int weightCat, int speedCat){
        this.nameCat = nameCat;
        this.weightCat = weightCat;
        this.speedCat = speedCat;
    }
    public void sayCat(){
        System.out.println("Meooo Meooooo");
    }

    public int getWeightCat() {
        return weightCat;
    }

    public void catchTheMouse(Rat rat){
        if (rat.speedRat < this.speedCat){
            System.out.println("Chuột bị mèo bắt");
        }else {
            System.out.println("Chuột đã chạy được");
        }
    }
    public void eatRat(Rat rat){
        if (rat.status){
            this.weightCat = this.weightCat + rat.weightRat;
            rat.Die();
            System.out.println("Chuột đã bị mèo thịt");
            System.out.println("Cân nặng của mèo: " + this.getWeightCat());
        }else {
            System.out.println("Chuột đã ngỏm lâu rồi ");
        }
    }
}
