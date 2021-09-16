public class Cercle extends Figura{
    private double r;
    final double PI = 3.14;

    Cercle(double r){
        this.r=r;
    }

    public double area(){
        return PI*r*r;
    }
}
