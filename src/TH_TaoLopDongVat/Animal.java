package TH_TaoLopDongVat;

public class Animal {
    public double weight;
    public double height;
    public Animal(){
        weight = 0.0;
        height = 0.0;
    }
    public Animal(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String toString(){
        return "A Animal with weight: " + getWeight()
                + " and height: " + getHeight();
    }
}
