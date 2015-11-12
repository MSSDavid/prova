package br.ufg.inf.es.construcao.primo09;

/**
 * Verifica se um número é primo ou não.
 */
public class Primo {

    /**
     * @param n Número a ser verificado.
     * @trhow n não pode ser menor que 1
     * @return É verdadeiro se n for primo e falso se não for.
     */      
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
