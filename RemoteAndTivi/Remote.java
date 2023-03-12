package RemoteAndTivi;

public class Remote {
    public int id;
    public String tv;
    public Remote(int id, String tv){
        this.id = id;
        this.tv = tv;
    }
    public void setChannel(String tv) {
        this.tv = tv;
    }
    public void setId(int id) {
        this.id = id;
    }
}
