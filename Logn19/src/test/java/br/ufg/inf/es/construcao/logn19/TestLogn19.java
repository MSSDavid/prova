package br.ufg.inf.es.construcao.logn19;
import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class TestLogn19 {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        Logn19.logn19(0, 9);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        Logn19.logn19(9, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3Parametro() throws Exception {
        Logn19.logn19(-9, 0);
    }    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(3.2, 3, 9);
        Assert.assertEquals(2.4, 0.25, 27);        
        Assert.assertEquals(4, 9, 16);
    }   
}