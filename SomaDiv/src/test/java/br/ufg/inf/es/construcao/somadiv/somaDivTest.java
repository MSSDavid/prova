package br.ufg.inf.es.construcao.somadiv;

import br.ufg.inf.es.construcao.somadiv.SomaDiv;
import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class somaDivTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        SomaDiv.somaDiv(-5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        SomaDiv.somaDiv(-4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3Parametro() throws Exception {
        SomaDiv.somaDiv(-18);
    }    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(8, SomaDiv.somaDiv(10));
        Assert.assertEquals(1340, SomaDiv.somaDiv(1000));
        Assert.assertEquals(49, SomaDiv.somaDiv(75));        
       
    }   
}