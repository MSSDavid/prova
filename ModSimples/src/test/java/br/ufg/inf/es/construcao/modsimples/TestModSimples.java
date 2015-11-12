package br.ufg.inf.es.construcao.modsimples;

import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class TestModSimples {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        ModSimples.modsimples(-5, 4);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        ModSimples.modsimples(4, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test1e2Parametros() throws Exception {
        ModSimples.modsimples(-20, -6);
    }    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(1, ModSimples.modsimples(13, 2));
        Assert.assertEquals(1, ModSimples.modsimples(26, 5));
        Assert.assertEquals(0, ModSimples.modsimples(100, 10));        
       
    }   
}