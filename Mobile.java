public class Mobile {
    public int batery;
    public String typing;
    public String [] inbox;
    public int couInbox;
    public String [] listMsgSent;
    public int countListMsgSent;
    public boolean isOn;

    public Mobile(){
        inbox = new String[1000];
        listMsgSent = new String[1000];
        batery = 70;
        isOn = true;
        couInbox = 0;
        countListMsgSent = 0;
    }
    public boolean isOn(){
        return this.isOn;
    }
    public void turnOn(){
        this.isOn = true;
    }
    public void turnOff(){
        this.isOn = false;
    }
    public void charging(){
        batery = 100;
    }
    public void typing(String msg){
        if (this.isOn){
            this.typing = msg;
            batery --;
        }else {
            System.out.println("Điện thoại hết pin!");
        }
    }
    public void send(Mobile receiver){
        if (this.isOn){
            if (countListMsgSent > 1000){
                System.out.println("Bộ nhớ đầy!");
            }else {
                if (!typing.equals("")){
                    this.listMsgSent[countListMsgSent] = this.typing;
                    receiver.receiver(this.typing);
                    this.typing= "";
                    batery --;
                }
            }
        }else {
            System.out.println("Điện thoại hết pin!");
        }
    }
    public void receiver(String msg){
        if (this.isOn){
            this.inbox[couInbox++]=msg;
            batery--;
        }else {
            System.out.println("Điện thoại hết pin!");
        }
    }
}
