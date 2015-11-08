package br.ufg.inf.es.construcao.fatsom17;
import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class TesteFatsom {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        Fatsom.fatsom(0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        Fatsom.fatsom(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3Parametro() throws Exception {
        Fatsom.fatsom(-9);
    }    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(24, Fatsom.fatsom(4));
        Assert.assertEquals(362880, Fatsom.fatsom(9));
        Assert.assertEquals(6, Fatsom.fatsom(3));        
       
    }   
}