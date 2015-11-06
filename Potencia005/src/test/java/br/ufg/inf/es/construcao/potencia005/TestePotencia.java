package br.ufg.inf.es.construcao.potencia005;

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
        Potencia.potencia(5, -4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test1e2Parametros() throws Exception {
        Potencia.potencia(-552, -9);
    }    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(16, Potencia.potencia(2, 4));
        Assert.assertEquals(100, Potencia.potencia(10, 2));
        Assert.assertEquals(100000, Potencia.potencia(10, 5));        
       
    }   
}