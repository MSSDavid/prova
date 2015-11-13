package br.ufg.inf.es.construcao.asfd;

import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertTrue;

/**
 *
 * @author David
 */
public class Teste40 {
    
    /*@Test(expected = IllegalArgumentException.class)
    public void test1Parametro() throws Exception {
        Produto.produto(-5, 4);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test2Parametro() throws Exception {
        Produto.produto(4, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test1e2Parametros() throws Exception {
        Produto.produto(-20, -6);
    }    */
    
    @Test
    public void testCasos() {
        Assert.assertTrue(Asfd40.fatdig(195));
       /* Assert.assertEquals(125, Produto.produto(25, 5));
        Assert.assertEquals(1000, Produto.produto(100, 10)); */       
       
    }   
}