package br.ufg.inf.es.construcao.primo09;

/**
 *
 * @author alunoinf
 */
public class Primo {
    
    public static boolean primo(int n) {
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
