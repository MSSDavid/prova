package br.ufg.inf.es.construcao.mdc11;

/**
 *
 * @author alunoinf
 */
public class Mdc {
    
    public static int mdc(int a, int b) {
        
        if (a < b) {
            throw new IllegalArgumentException("A menor que B");
        }
        
        if (b < 0) {
            throw new IllegalArgumentException("B menor que 0");
        }
        
        while (b != 0) {
            
            int m = (a % b);
            a = b;
            b = m;
        }
        
        return a;
    }
    
}
