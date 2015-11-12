package br.ufg.inf.es.construcao.permutar;

import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class TestePermutar {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        Permutar.permutar(new int[] {1,2,3,4,5}, -5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        Permutar.permutar(new int[] {1,2,3,4,5}, -6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3Parametro() throws Exception {
        Permutar.permutar(new int[] {1,2,3,4,5}, -7);
    }    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(3, Permutar.permutar(new int[] {1,2,3,4,5}, 5));      
       
    }   
}
