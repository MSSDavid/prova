package br.ufg.inf.es.construcao.fatorial16;

import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class TestFat {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        Fat16.fat(-5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        Fat16.fat(-4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test1e2Parametros() throws Exception {
        Fat16.fat(0);
    }    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(2, Fat16.fat(2));
        Assert.assertEquals(6, Fat16.fat(3));
        Assert.assertEquals(3628800, Fat16.fat(10));        
       
    }   
}