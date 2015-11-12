package br.ufg.inf.es.construcao.fatorial16;

/**
 * Calcula o fatoria de um número.
 */
public class Fat16 {

    /**
     * @param n Número a ser fatorado.
     * @trhow n Não deve ser menor que 1.
     * @return Resultado do fatorial de n.
     */       
    public static long fat(long n) {
        
        if (n < 1) {
            throw new IllegalArgumentException("n: Menor que 1");            
        }
        
        long i = 2;
        long f = 1;
                
        while (i <= n) {
            f *= i;
            i++;
        }
        
        return f;
    }
    
}
