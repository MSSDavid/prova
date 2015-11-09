package br.ufg.inf.es.construcao.somaarray46;

/**
 * Hello world!
 *
 */
public class SomaArray46 {
    
    public static int somaarray46(int A[], int n) {
        
        if (n < 0) { 
            throw new IllegalArgumentException("n: Menor que 0");
        }
               
        
        int s = 0;
        int i = 0;
        
        while (i < n) {
            s = (s + A[i]);
            i += 1;
        }
        
        return s;
    }
    

    
}
