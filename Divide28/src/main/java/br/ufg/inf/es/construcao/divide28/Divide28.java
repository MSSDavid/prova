package br.ufg.inf.es.construcao.divide28;

/**
 *
 * @author alunoinf
 */
public class Divide28 {
    
    public static (int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("n: Menor que 1"); 
        }
        
        int i = 2;
        
        while (i <= (n - 1)) {
            if ((n % i) == 0) {
                return false;
            }
            i++;
        } 
        
        return true;
    }
    
}
