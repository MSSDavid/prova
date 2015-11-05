package br.com.es.construcao.potenciasoma06;

import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class TestPotSom {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        PotSom.potsom(-5, 4);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        PotSom.potsom(4, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test1e2Parametros() throws Exception {
        PotSom.potsom(-20, -6);
    }    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(169, PotSom.potsom(13, 2));
        Assert.assertEquals(25, PotSom.potsom(5, 2));
        Assert.assertEquals(1024, PotSom.potsom(2, 10));        
       
    }   
}