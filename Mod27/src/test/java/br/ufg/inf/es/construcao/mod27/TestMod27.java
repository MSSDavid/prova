package br.ufg.inf.es.construcao.mod27;
import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class TestMod27 {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        Mod27.mod27(0, 9);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        Mod27.mod27(9, -3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3Parametro() throws Exception {
        Mod27.mod27(-9, 7);
    }    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(2, Mod27.mod27(7, 5));
        Assert.assertEquals(3, Mod27.mod27(13, 10));
        Assert.assertEquals(2, Mod27.mod27(8, 3));
       
    }   
}