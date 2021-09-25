import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GestorFiguras {

    public static double suma (Figura[] v){
        double res = 0;
        for (Figura f:v){
            res+= f.area();
        }
        return res;
    }

    public static void sort(Figura[] v){
        Arrays.sort(v);
    }

    public static void main(String[]args){
        TriangleEQ t= new TriangleEQ (2,3);
        Cercle c = new Cercle (1);
        Rectangle r = new Rectangle (2,4);
        Quadrat q = new Quadrat (5);

        Figura[] figuras ={t, c, r, q};

        for (Figura figura : figuras) {
            System.out.println(figura.area());
        }
        System.out.println(suma(figuras));
        /*ArrayList<Figura> figuras2 =new ArrayList<>();
        figuras2.add(t);figuras2.add(c);figuras2.add(r);figuras2.add(q);

        Collections.sort(figuras2);
        for (Figura figura : figuras2) {
            System.out.println(figura.area());
        }

         */
        sort(figuras);
        for (Figura figura : figuras) {
            System.out.println(figura.area());
        }



    }
}
