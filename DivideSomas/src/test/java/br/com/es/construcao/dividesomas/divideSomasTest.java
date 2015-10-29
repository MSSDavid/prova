package br.com.es.construcao.dividesomas;

import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class divideSomasTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        DivideSomas.divideSomas(-5, 4);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        DivideSomas.divideSomas(4, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test1e2Parametros() throws Exception {
        DivideSomas.divideSomas(-20, -6);
    }    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(6, DivideSomas.divideSomas(12, 2));
        Assert.assertEquals(5, DivideSomas.divideSomas(26, 5));
        Assert.assertEquals(10, DivideSomas.divideSomas(100, 10));        
       
    }   
}