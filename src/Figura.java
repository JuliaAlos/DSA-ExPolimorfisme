public abstract class Figura implements Comparable<Figura>{
    public Figura(){}

    abstract public double area();

    public int compareTo(Figura f){
        if(f.area()>this.area()) {
            return -1;
        }
        else if (f.area()==this.area()){
            return 0;
        }
        else{
            return 1;
        }

    }

}
