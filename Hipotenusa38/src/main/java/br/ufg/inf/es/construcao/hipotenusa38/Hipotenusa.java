package br.ufg.inf.es.construcao.hipotenusa38;

import br.ufg.inf.es.construcao.raizquadrada29.RaizQuad;

/**
 * Cálculo da Hipotenusa
 */
public class Hipotenusa {

    /**
     * @param a Um dos lados do triangulo retangulo
     * @param b Um dos lados do triangulo retangulo
     * @return Resultado da hipotenusa.
     */     
    public static float hipotenusa(int a, int b) {
        
        int x = a * a;
        int y = b * b;
        float r = RaizQuad.raizquad(2, (x+y));
        
        
        return r;
    }
    
}

