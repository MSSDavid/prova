package br.ufg.inf.es.construcao.luhn35;
import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class TestCrivo {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        Luhn35.luhn((new int[] {4,5,6,7,8,9,10,2,3,1}), 1);
    }

    /*@Test(expected = IllegalArgumentException.class)
    public void test3Parametro() throws Exception {
        Mod27.mod27(-9, 7);
    } */   
    
    @Test
    public void testCasos() {
        Assert.assertEquals(1, Luhn35.luhn((new int[] {4,5,6,7,8,9,0,2,3,1}), 10));
        Assert.assertEquals(1, Luhn35.luhn((new int[] {4,5,6,7,8,9,0,2,3,2}), 10));
        Assert.assertEquals(4, Luhn35.luhn((new int[] {1,2,3,4}), 4));
    }   
}