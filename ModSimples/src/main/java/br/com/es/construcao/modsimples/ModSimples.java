package br.com.es.construcao.modsimples;

import br.com.es.construcao.divideSubt;

/**
 * 
 * @author alunoinf
 */
public class ModSimples {
    
    
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
