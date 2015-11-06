package br.ufg.inf.es.construcao.primo09;

import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertFalse;

/**
 *
 * @author David
 */
public class TestePrimo {

    @Test(expected = IllegalArgumentException.class)
    public void testParametro1() throws Exception {
        Primo.primo(1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParametro2() throws Exception {
        Primo.primo(-4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testeParametro3() throws Exception {
        Primo.primo(-5529);
    }

    @Test
    public void testCasos() {
        Assert.assertTrue(Primo.primo(5));
        Assert.assertFalse(Primo.primo(10));
        Assert.assertTrue(Primo.primo(7));

    }
}