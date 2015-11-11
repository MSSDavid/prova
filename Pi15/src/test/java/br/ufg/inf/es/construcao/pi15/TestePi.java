package br.ufg.inf.es.construcao.pi15;
import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class TestePi {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        Pi15.pi(0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        Pi15.pi(-3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3Parametro() throws Exception {
        Pi15.pi(-9);
        Pi15.pi(-6);
    }    
    
    @Test
    public void testCasos() {

        assertEquals(3.1, Pi15.pi(30), 0.1d);
        assertEquals(3.12d, Pi15.pi(50), 0.01d);
        assertEquals(3.1365d, Pi15.pi(200), 0.0001d);
        assertEquals(3.1415d, Pi15.pi(999999999), 0.0001d);
       
    }   
}