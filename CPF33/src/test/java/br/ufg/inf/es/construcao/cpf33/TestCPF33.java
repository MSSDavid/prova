package br.ufg.inf.es.construcao.cpf33;
import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertTrue;

/**
 *
 * @author David
 */
public class TestCPF33 {
       
    @Test
    public void testCasos() {
        Assert.assertTrue(CPF33.cpf(new int[] {0,5,0,0,6,2,8,2,3,8,0}));
        Assert.assertFalse(CPF33.cpf(new int[] {0,5,5,0,6,2,8,2,3,8,0}));
       
    }   
}