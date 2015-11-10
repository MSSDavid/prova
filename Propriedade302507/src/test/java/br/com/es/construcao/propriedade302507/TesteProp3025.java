package br.com.es.construcao.propriedade302507;

import br.ufg.inf.es.construcao.propriedade302507.Prop3025;
import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertFalse;

/**
 *
 * @author David
 */
public class TesteProp3025 {
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametro() throws Exception {
        Prop3025.prop3025(-5);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testParametro2() throws Exception {
        Prop3025.prop3025(-10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParametro3() throws Exception {
        Prop3025.prop3025(12589);
    }    
    
    @Test
    public void testCasos() {
        Assert.assertTrue(Prop3025.prop3025(3025));
        Assert.assertFalse(Prop3025.prop3025(1000));
        Assert.assertTrue(Prop3025.prop3025(9801));        
       
    }   
}