package br.com.es.construcao.produto4;

import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author David
 */
public class TesteProduto {
    
    @Test(expected = IllegalArgumentException.class)
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
    }    
    
    @Test
    public void testCasos() {
        Assert.assertEquals(26, Produto.produto(13, 2));
        Assert.assertEquals(125, Produto.produto(25, 5));
        Assert.assertEquals(1000, Produto.produto(100, 10));        
       
    }   
}