package br.ufg.inf.es.construcao.hipotenusa38;
import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class TesteHipotenusa {
    
    @Test
    public void testCasos() {
        Assert.assertEquals(200, 160, 120);     
        Assert.assertEquals(200, 4, 3); 
        Assert.assertEquals(20, 16, 12); 
       
    }   
}