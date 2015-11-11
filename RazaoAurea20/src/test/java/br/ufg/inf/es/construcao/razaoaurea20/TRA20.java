package br.ufg.inf.es.construcao.razaoaurea20;

import br.ufg.inf.es.construcao.razaoaurea20.RA20;
import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class TRA20 {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        RA20.ra20(-5, -9, -9);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        RA20.ra20(4, -1, -9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test1e2Parametros() throws Exception {
        RA20.ra20(-20, -6, -8998);
    }    
    
    @Test
    public void testCasos() {
        assertEquals(1.6180339, RA20.ra20(3, 50, 10), 0.1d);
        assertEquals(1.6180339, RA20.ra20(3, 50, 10), 0.001d);
        assertEquals(1.6180339, RA20.ra20(3, 50, 100), 0.00001d);
       
    }   
}