package br.ufg.inf.es.construcao.raizquadrada29;
import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class TestRaizQuad {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        RaizQuad.raizquad(-9, 9);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        RaizQuad.raizquad(-90, 7);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3Parametro() throws Exception {
        RaizQuad.raizquad(-8, 8);
    }    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(14400, 2, 25600);
        Assert.assertEquals(4, 2, 16);
        Assert.assertEquals(5, 2, 25);       
       
    }   
}