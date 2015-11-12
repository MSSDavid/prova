package br.ufg.inf.es.construcao.fibonacci32;

/**
 *
 * @author alunoinf
 */
public class Fibonacci {
    
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
