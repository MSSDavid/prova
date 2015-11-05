package br.com.es.construcao.produto4;

/**
 *
 * @author alunoinf
 */
public class Produto {
    
    public static int produto (int a, int b) {
        
        if (a < 0) {
            throw new IllegalArgumentException("a: menor que 0");
        }
        
        if (b < 0) {
            throw new IllegalArgumentException("b: menor que 0");
        }
        
        int i = 1;
        int s = 0;
        
        while ( i <= b) {
            s += a;
            i += 1;
        }
        
        return s;
    }
    
}
