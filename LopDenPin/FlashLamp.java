package LopDenPin;

public class FlashLamp {
    public boolean status;
    Battery battery;
    FlashLamp (){
        status = false;
        battery = null;
    }
    public void setBattery (Battery b){
        this.battery = b;
    }
    public int getBatteryInfo(){
        return this.battery.getEnergy();
    }
    public void turnOn(){
        status = true;
        if (battery.getEnergy()> 0 ){
            System.out.println("Đèn sáng");
            battery.decreaseEnergy();
        }
    }
    public void turnOf(){
        status = false;
        System.out.println("Đèn tắt");
    }
}
