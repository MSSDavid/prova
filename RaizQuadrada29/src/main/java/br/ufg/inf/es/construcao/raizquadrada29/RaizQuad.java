package br.ufg.inf.es.construcao.raizquadrada29;

public class RaizQuad {
    
    public static float raizquad(int n, int i) {
        if (n < 0) {
            throw new IllegalArgumentException("n: Menor que 0");
        }
        
        float r = 1;
        
        while (i >= n) {
            r = (r + n/r)/2;
            i -= 1;
        }
        
        return r;
    }
    
}

