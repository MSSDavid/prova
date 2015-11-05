package br.com.es.construcao.potencia05;

import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class TestePotencia {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        Potencia.potencia(-5, 4);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        Potencia.potencia(4, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test1e2Parametros() throws Exception {
        Potencia.potencia(-20, -6);
    }    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(169, Potencia.potencia(13, 2));
        Assert.assertEquals(25, Potencia.potencia(5, 2));
        Assert.assertEquals(1024, Potencia.potencia(2, 10));        
       
    }   
}
