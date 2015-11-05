package br.ufg.inf.es.construcao.somanaturais03;

import br.ufg.inf.es.construcao.somanaturais03.SomaNat;
import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class TesteSomaNat {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        SomaNat.somanat(-5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        SomaNat.somanat(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test1e2Parametros() throws Exception {
        SomaNat.somanat(-45);
    }    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(36, SomaNat.somanat(8));
        Assert.assertEquals(15, SomaNat.somanat(5));
        Assert.assertEquals(55, SomaNat.somanat(10));        
       
    }   
}
