package br.ufg.inf.es.construcao.somatorio14;
import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class Test14 {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        Somat14.somat(0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        Somat14.somat(-3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3Parametro() throws Exception {
        Somat14.somat(-9);
        Somat14.somat(-6);
    }    
    
    @Test
    public void testCasos() {

        assertEquals(0.5, Somat14.somat(1), 0.01d);
        assertEquals(0.7d, Somat14.somat(2), 0.01d);
        assertEquals(0.79d, Somat14.somat(3), 0.01d);
       
    }   
}