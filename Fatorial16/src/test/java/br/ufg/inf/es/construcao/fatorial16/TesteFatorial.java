package br.ufg.inf.es.construcao.fatorial16;
import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class TesteFatorial {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        Fatorial.fatorial(0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        Fatorial.fatorial(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3Parametro() throws Exception {
        Fatorial.fatorial(-9);
    }    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(24, Fatorial.fatorial(4));
        Assert.assertEquals(362880, Fatorial.fatorial(9));
        Assert.assertEquals(6, Fatorial.fatorial(3));        
       
    }   
}