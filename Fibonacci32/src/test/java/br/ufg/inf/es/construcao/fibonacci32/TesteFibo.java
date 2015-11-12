package br.ufg.inf.es.construcao.fibonacci32;

import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class TesteFibo {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        Fibonacci.fibonacci(-5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        Fibonacci.fibonacci(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test1e2Parametros() throws Exception {
        Fibonacci.fibonacci(-20);
    }    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(1, Fibonacci.fibonacci(1));
        Assert.assertEquals(0, Fibonacci.fibonacci(0));
        Assert.assertEquals(55, Fibonacci.fibonacci(10));
        Assert.assertEquals(17711, Fibonacci.fibonacci(22));
        Assert.assertEquals(3, Fibonacci.fibonacci(4));
        Assert.assertEquals(5, Fibonacci.fibonacci(5));        
       
    }   
}