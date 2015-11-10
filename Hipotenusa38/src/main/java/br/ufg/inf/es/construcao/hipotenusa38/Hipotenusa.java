package br.ufg.inf.es.construcao.hipotenusa38;

import br.ufg.inf.es.construcao.raizquadrada29.RaizQuad;

public class Hipotenusa {
    
    public static float hipotenusa(int a, int b) {
        
        int x = a * a;
        int y = b * b;
        float r = RaizQuad.raizquad(2, (x+y));
        
        
        return r;
    }
    
}

