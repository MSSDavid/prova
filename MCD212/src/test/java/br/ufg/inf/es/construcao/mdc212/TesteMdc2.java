package br.ufg.inf.es.construcao.mdc212;
import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class TesteMdc2 {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        Mdc2.mdc2(4, 5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        Mdc2.mdc2(-2, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test1e2Parametros() throws Exception {
        Mdc2.mdc2(1, 2);
    }    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(4, Mdc2.mdc2(36, 16));
        Assert.assertEquals(10, Mdc2.mdc2(30, 20));
        Assert.assertEquals(2, Mdc2.mdc2(4, 2));        
       
    }   
}