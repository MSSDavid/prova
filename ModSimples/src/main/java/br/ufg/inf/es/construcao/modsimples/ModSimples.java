package br.ufg.inf.es.construcao.modsimples;

import br.ufg.inf.es.construcao.dividesubt.DivideSubt;

/**
 * Calcula o resto da divisão entre dois números
 */
public class ModSimples {
    
    /**
     * @param x Divisor da data a ser consultada
     * @param y Dividendo da data a ser consultada
     * @return  Recebe o resto da divisão dos números acima
     */ 
    public static int modsimples(int x, int y) {
        
        if (x < 0) {
            throw new IllegalArgumentException("x: Menor que 0");            
        }
        
        if (y < 0) {
            throw new IllegalArgumentException("y: Menor que 0");            
        }
        
        int d = DivideSubt.divideSubt(x, y);
                
        return x - (d * y);
    }
    
    
    
}
