import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GestorFigurasTest {
    Figura[] v;
    //Figura[] v = new Figura[4];
    @After


    @Before
    public void settup() {
        this.v =new Figura[4];
        this.v[0]= new Rectangle(2,3);
        this.v[1]= new Cercle(1);
        this.v[2]= new Quadrat(2);
        this.v[3]= new TriangleEQ(2,3);
    }

    @Test
    public void testSuma(){
        Assert.assertEquals(6, this.v[0].area(), 0);
        Assert.assertEquals(3.14, this.v[1].area(), 0);
        Assert.assertEquals(4, this.v[2].area(), 0);
        Assert.assertEquals(3, this.v[3].area(), 0);
        Assert.assertEquals(16.14, GestorFiguras.suma(this.v),0);
    }

    @Test
    public void testSort(){
        GestorFiguras.sort(this.v);
        Assert.assertEquals(3,this.v[0].area(),0);

    }

}
