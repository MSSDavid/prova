package br.ufg.inf.es.construcao.diasemana01;

import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class TesteDiaSemana {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        DiaSemana.diasemana(-5, 13, 100);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        DiaSemana.diasemana(5, 13, 2008);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test1e2Parametros() throws Exception {
        DiaSemana.diasemana(400, 1258, 1600);
    }    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(3, DiaSemana.diasemana(16, 10, 1997));
        Assert.assertEquals(3, DiaSemana.diasemana(5, 11, 2015));
        Assert.assertEquals(4, DiaSemana.diasemana(16, 10, 1998));        
       
    }   
}
