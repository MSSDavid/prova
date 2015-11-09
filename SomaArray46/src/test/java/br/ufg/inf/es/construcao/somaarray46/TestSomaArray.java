package br.ufg.inf.es.construcao.somaarray46;

import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class TestSomaArray {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        SomaArray46.somaarray46(new int[] {1,2,3,4,5}, -5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        SomaArray46.somaarray46(new int[] {1,2,3,4,5}, -6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3Parametro() throws Exception {
        SomaArray46.somaarray46(new int[] {1,2,3,4,5}, -7);
    }    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(3, SomaArray46.somaarray46(new int[] {1,2,3,4,5}, 2));
        Assert.assertEquals(6, SomaArray46.somaarray46(new int[] {1,2,3,4,5}, 3));
        Assert.assertEquals(10, SomaArray46.somaarray46(new int[] {1,2,3,4,5}, 4));        
       
    }   
}
