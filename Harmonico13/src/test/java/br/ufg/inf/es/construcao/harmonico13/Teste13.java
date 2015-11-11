package br.ufg.inf.es.construcao.harmonico13;
import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class Teste13 {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        Harmonico13.harmonico(0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        Harmonico13.harmonico(-3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3Parametro() throws Exception {
        Harmonico13.harmonico(-9);
        Harmonico13.harmonico(-6);
    }    
    
    @Test
    public void testCasos() {
        assertEquals(1.83d, Harmonico13.harmonico(3), 0.01d);
        assertEquals(1.5d, Harmonico13.harmonico(2), 0.000000000001d);
       
    }   
}