package br.com.es.construcao.prop1538;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author David
 */
public class TestProp1538 {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        Prop1538.prop1538(-5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        Prop1538.prop1538(5020);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3Parametro() throws Exception {
        Prop1538.prop1538(1000);
    }
    
    @Test
    public void testCasos() {
        Assert.assertTrue(Prop1538.prop1538(153));
        Assert.assertFalse(Prop1538.prop1538(555));        
        Assert.assertTrue(Prop1538.prop1538(0));       
    }   
}

