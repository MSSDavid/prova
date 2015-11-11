package br.ufg.inf.es.construcao.fatorial17;

import br.com.es.construcao.produto4.Produto;
/**
 * x: Base
 * y: Potencia
 * p: Variável Auxiliar
 * d: Resultado
 */
public class Fat17 {
    
    public static long fat(long n) {
        
        if (n < 1) {
            throw new IllegalArgumentException("n: Menor que 1");            
        }
        
        long i = 2;
        long f = 1;
                
        while (i <= n) {
            f = Produto.produto(f,i);
            i++;
        }
        
        return f;
    }
    
}
