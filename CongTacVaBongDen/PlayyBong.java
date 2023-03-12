package CongTacVaBongDen;

public class PlayyBong {
    public static void main(String[] args) {
        ElectricLamp electricLamp = new ElectricLamp(false);
        SwithchButton swithchButton = new SwithchButton(false, electricLamp);
        for(int i = 0 ; i < 10; i ++ ){
            swithchButton.switchOn();
            electricLamp.getStatus();
            swithchButton.switchOff();
            electricLamp.getStatus();
        }
    }
}
