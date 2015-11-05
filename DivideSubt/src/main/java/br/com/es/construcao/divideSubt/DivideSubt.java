package br.com.es.construcao.divideSubt;

/**
 *
 * x: Dividendo
 * y: Divisor
 * s: Variável Auxiliar
 * d: Quociente
 */
public class DivideSubt {
    
    public static int divideSubt(int x, int y) {
        
        if (x < 0) {
            throw new IllegalArgumentException("x: Menor que 0");            
        }
        
        if (y < 0) {
            throw new IllegalArgumentException("y: Menor que 0");            
        }
        
        int d = 0;
        int s = x;
        
        while (y <= s) {
            s = s - y;
            d = d + 1;
        }
        
        return d;
    }
    
}
