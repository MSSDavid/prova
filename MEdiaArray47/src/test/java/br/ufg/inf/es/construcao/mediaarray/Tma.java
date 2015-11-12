package br.ufg.inf.es.construcao.mediaarray47;

import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class Tma {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        MediaArray47.mediarray(new int[] {1,2,3,4,5}, -5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        MediaArray47.mediarray(new int[] {1,2,3,4,5}, -6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3Parametro() throws Exception {
        MediaArray47.mediarray(new int[] {1,2,3,4,5}, -7);
    }    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(3, MediaArray47.mediarray(new int[] {1,2,3,4,5}, 5));      
       
    }   
}
