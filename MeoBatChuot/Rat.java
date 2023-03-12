package MeoBatChuot;

public class Rat {
    public String nameRat;
    public int weightRat;
    public int speedRat;
    public boolean status;
    public Rat (String nameRat, int weightRat, int speedRat, boolean status){
        this.nameRat = nameRat;
        this.weightRat = weightRat;
        this.speedRat = speedRat;
        this.status = status;
    }
    public void getStatus(){
        if (!status){
            System.out.println("Chuột sống");
        }else {
            System.out.println("Chuột chếttt");
        }
    }
    public boolean Die(){
        return this.status = false;
    }
    public boolean noDie(){
        return this.status = true;
    }
    public void sayRat(){
        System.out.println("Chit Chitt");
    }
}
