package br.ufg.inf.es.construcao.quadradoperfeito;

/**
 * Verifica se um número é quadrado perfeito ou não.
 */
public class QuadPerf {

    /**
     * @param k Número a ser verificado.
     * @trhow k não pode ser menor que 1
     * @return É verdadeiro se k for quadrado perfeito e falso se não for.
     */      
    public static boolean primo(int k) {
        if (k <= 1) {
            throw new IllegalArgumentException("k: Menor que 1"); 
        }
        
        int i = 1;
        int q = 1;
        
        while (q < k) {
            i += 2;
            q += i;                
        }
        
        return (q == k);
    }
    
}
