package br.com.es.construcao.dividesomas;

/**
 * Calcula a divisão entre dois números, por meio de somas.
 */
public class DivideSomas {

    /**
     * @param x Dividendo
     * @param y Divisor
     * @return Resultado da divisão entre o primeiro e o segundo parâmentro.
     */      
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
