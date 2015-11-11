package br.ufg.inf.es.construcao.potencia005;

import br.ufg.inf.construcao.produto4.Produto;
 
/**
 *
 * @author alunoinf
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
            p = Produto.produto(x, p);
            i += 1;
        }
    
        return p;
    
    }
}
