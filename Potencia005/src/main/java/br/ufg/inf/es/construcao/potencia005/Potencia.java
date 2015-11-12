package br.ufg.inf.es.construcao.potencia005;

import br.ufg.inf.es.construcao.produto4.Produto;

/**
 * Calcula a potência de uma base e um expoente
 */
public class Potencia {

    /**
     * @param x Base
     * @trhow x não pode ser menor ou igual a zero.
     * @param y Expoente
     * @trhow y não pode ser menor que 0
     * @return Resultado da potência de x por y
     */        
    public static int potencia (int x, int y) {
        
        if (x <= 0) {
            throw new IllegalArgumentException("x: Menor ou igual a 0");
        }
        
        if (y < 0) {
            throw new IllegalArgumentException("x: Menor que 0");
        }
    
        int i = 1;
        int p = 1;
    
        while ( i <= y ) {
            p = Produto.produto(x, p);
            i += 1;
        }
    
        return p;
    
    }
}
