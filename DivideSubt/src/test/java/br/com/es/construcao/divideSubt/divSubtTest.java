package br.com.es.construcao.divideSubt;

import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class divSubtTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        DivideSubt.divideSubt(-5, 4);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        DivideSubt.divideSubt(4, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test1e2Parametros() throws Exception {
        DivideSubt.divideSubt(-20, -6);
    }    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(6, DivideSubt.divideSubt(12, 2));
        Assert.assertEquals(5, DivideSubt.divideSubt(26, 5));
        Assert.assertEquals(10, DivideSubt.divideSubt(100, 10));        
       
    }   
}