package CongTacVaBongDen;

public class SwithchButton {
    public boolean status;
    public ElectricLamp lamp;
    public SwithchButton (boolean status, ElectricLamp lamp){
        this.status = status;
        this.lamp = lamp;
    }

    public ElectricLamp getLamp() {
        return lamp;
    }

    public void setLamp(ElectricLamp lamp) {
        this.lamp = lamp;
    }

    public ElectricLamp connectToLamp(){
        return this.lamp = lamp;
    }
    public boolean switchOff(){
        this.lamp.status = false;
        return this.status = false;
    }
    public boolean switchOn(){
        this.lamp.status = true;
        return this.status = true;
    }
}
