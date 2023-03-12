package LopDenPin;

public class Battery {
    int energy;
    Battery(){
        energy = 10;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public int getEnergy (){
        return this.energy;
    }
    public void decreaseEnergy(){
        if (this.energy > 0){
            this.energy--;
        }
    }
}
