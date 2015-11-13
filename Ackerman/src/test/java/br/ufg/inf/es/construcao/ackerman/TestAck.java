package br.ufg.inf.es.construcao.ackerman;

import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class TestAck {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        Ackerman.ack(-5, 4);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        Ackerman.ack(4, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test1e2Parametros() throws Exception {
        Ackerman.ack(-20, -6);
    }    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(9, Ackerman.ack(2, 3));
        Assert.assertEquals(125, Ackerman.ack(3, 4));
        Assert.assertEquals(1, Ackerman.ack(0, 0));  
       
    }   
}