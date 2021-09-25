public class TriangleEQ extends Figura{

    private double b;
    private double h;

    TriangleEQ(double b,double h){
        this.b=b;
        this.h=h;
    }

    public double area(){
        return b*h/2;
    }
}
