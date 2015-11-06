package br.ufg.inf.es.construcao.mdc11;

import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class TesteMdc {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        Mdc.mdc(4, 5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        Mdc.mdc(-2, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test1e2Parametros() throws Exception {
        Mdc.mdc(1, 2);
    }    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(4, Mdc.mdc(36, 16));
        Assert.assertEquals(10, Mdc.mdc(30, 20));
        Assert.assertEquals(2, Mdc.mdc(4, 2));        
       
    }   
}