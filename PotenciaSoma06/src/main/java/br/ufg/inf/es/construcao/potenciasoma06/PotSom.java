package br.ufg.inf.es.construcao.potenciasoma06;

/**
 * Calcula a potência de uma base e um expoente
 */
public class PotSom {

    /**
     * @param x Base
     * @param y Expoente
     * @return Resultado da potência de x por y
     */     
    public static int potsom(int x, int y) {
        
        if (x <= 0) {
            throw new IllegalArgumentException("x: Menor que 0");            
        }
        
        if (y < 1) {
            throw new IllegalArgumentException("y: Menor ou igual a 1");            
        }
        
        int i = 1;
        int p = x;
        
        while (i < y) {
            p = (p * x);
            i += 1;
        }
        
        return p;
    }
    
}
