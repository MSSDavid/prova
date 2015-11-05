package br.com.es.construcao.potencia05;

/**
 * x: base
 * y: potência
 *
 */
public class Potencia {
    
    public static int potencia (int x, int y) {
        
        if (x <= 0) {
            throw new IllegalArgumentException("x: Menor que 0");
        }
        
        if (y < 0) {
            throw new IllegalArgumentException("x: Menor que 0");
        }
    
        int i = 1;
        int p = 1;
    
        while ( i <= y ) {
            p = p * x;
            i += 1;
        }
    
        return p;
    
    }
}
