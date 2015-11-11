package br.ufg.inf.es.construcao.cpf34;
import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertFalse;

/**
 *
 * @author David
 */
public class TestCrivo {
       
    @Test
    public void testCasos() {
        Assert.assertTrue(CPF34.cpf(new int[] {0,5,0,0,6,2,8,2,3,8,0}));
        Assert.assertFalse(CPF34.cpf(new int[] {0,5,5,0,6,2,8,2,3,8,0}));       
    
    }   
}