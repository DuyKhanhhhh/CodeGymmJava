package LopDenPin;

public class DenPin {
    public static void main(String[] args) {
        Battery battery = new Battery();
        FlashLamp flashLamp = new FlashLamp();
        flashLamp.setBattery(battery);
        for (int i = 0; i <= 3; i++){
            flashLamp.turnOn();
            flashLamp.turnOf();
        }
        System.out.println("Năng lượng còn lại trong pin: " + flashLamp.getBatteryInfo());
    }
}
