package br.ufg.inf.es.construcao.fibonacci32;

/**
 * Verifica o número de Fibonacci.
 */
public class Fibonacci {

    /**
     * @param n Quanto maior, mais preciso será do número de Fibonacci.
     * @trhow n não pode ser menor que zero.
     * @return Retorna o número de Fibonacci.
     */    
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n: Menor que 0"); 
        }
        
        int a = 0;
        int c = 1;
        
        if ((n == 0) || (n == 1)) {
            return n;
        }
        
        int i = 2;
        
        while (i <= n) {
            int t = c;
            c += a;
            a = t;
            i++;
        } 
        
        return c;
    }
    
} 
