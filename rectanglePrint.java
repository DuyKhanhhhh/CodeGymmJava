public class rectanglePrint {
    public int length, width;
    public rectanglePrint(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int getArea(){
        return this.length * this.width;
    }
    public double getPerimeter(){
        return (this.length * this.width) * 2;
    }
}
