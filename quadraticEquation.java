public class quadraticEquation {
    public double a, b, c;
    public double delta;
    public quadraticEquation(double a, double b , double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        return delta = (this.b * this.b) + 4 * this.a * this.c;
    }
    public double getRoot1(){
        delta = (this.b * this.b) + 4 * this.a * this.c;
        return (- this.b + Math.sqrt(delta)) / 2 * this.a;
    }
    public double getRoot2(){
        delta = (this.b * this.b) + 4 * this.a * this.c;
        return (- this.b - Math.sqrt(delta)) / 2 * this.a;
    }
    public double getRoot(){
        return (- this.b) / 2 * this.a;
    }
}
