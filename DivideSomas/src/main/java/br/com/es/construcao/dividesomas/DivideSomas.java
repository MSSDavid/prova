package br.com.es.construcao.dividesomas;

/**
* x: Dividendo
 * y: Divisor
 * s: Variável Auxiliar
 * d: Quociente
 */
public class DivideSomas {
    
    public static int divideSomas(int x, int y) {
        
        if (x < 0) {
            throw new IllegalArgumentException("x: Menor que 0");            
        }
        
        if (y < 0) {
            throw new IllegalArgumentException("y: Menor que 0");            
        }
        
        int d = 0;
        int s = y;
        
        while (x >= s) {
            s += y;
            d += 1;
        }
        
        return d;
    }
    
}
