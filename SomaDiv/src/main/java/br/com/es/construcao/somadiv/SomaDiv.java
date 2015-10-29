package br.com.es.construcao.somadiv;

/**
 *
 * @author David Matheus
 */
public class SomaDiv {
    
    public static int somaDiv(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n: Menor que 0");
        }
        
        int d = 2;
        int s = 1;
        
        while (d <= (Math.abs(n))/2) {
            if ((n % d)==0) {
                s += d;
            }
            
            d += 1;
        }
        
        return s;
    }
    
}
