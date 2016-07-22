package br.ufg.inf.es.construcao.fatorial17;

import br.ufg.inf.es.construcao.produto4.Produto;
/**
 * x: Base
 * y: Potencia
 * p: Variável Auxiliar
 * d: Resultado
 */
public class Fat17 {
    
    public static int fat(int n) {
        
        if (n < 1) {
            throw new IllegalArgumentException("n: Menor que 1");            
        }
        
        int i = 2;
        int f = 1;
                
        while (i <= n) {
            f = Produto.produto(i,i);
            i++;
        }
        
        return f;
    }
    
}
