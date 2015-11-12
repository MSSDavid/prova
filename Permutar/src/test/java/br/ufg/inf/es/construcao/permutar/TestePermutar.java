package br.ufg.inf.es.construcao.permutar;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestePermutar {
    @Test
    public void test1caractere() {
        List<String> retorno = Permutar.permuta("", "y", new ArrayList<String>());
        Assert.assertEquals(1, retorno.size());
        Assert.assertEquals("y", retorno.get(0));
    }

    @Test
    public void test2caracteres() {
        List<String> retorno = Permutar.permuta("", "xy", new ArrayList<String>());
        Assert.assertEquals(2, retorno.size());
        Assert.assertTrue(retorno.contains("xy"));
        Assert.assertTrue(retorno.contains("yx"));
    }

    @Test
    public void testvariado() {
        List<String> retorno = Permutar.permuta("", "qwerty", new ArrayList<String>());
        Assert.assertEquals(720, retorno.size());
    }
}