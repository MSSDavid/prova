package br.ufg.inf.es.construcao.amigos22;

import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertFalse;

public class TesteAmigos {

    @Test(expected = IllegalArgumentException.class)
    public void testParametro1() throws Exception {
        Amigos.amigos(0,1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParametro2() throws Exception {
        Amigos.amigos(9,-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testeParametro3() throws Exception {
        Amigos.amigos(-5529, -999);
    }

    @Test
    public void testCasos() {
        Assert.assertTrue(Amigos.amigos(220, 284));
        Assert.assertFalse(Amigos.amigos(10, 15));

    }
}