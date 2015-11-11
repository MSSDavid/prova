package br.ufg.inf.es.construcao.lognatural18;

import br.ufg.inf.es.construcao.fatorial17.Fat17;
import br.ufg.inf.es.construcao.produto4.Produto;

public class Log18 {
    
    public static long log18(int n, int k) {
        if (n < 1) {
            throw new IllegalArgumentException("n: Menor que 1");
        }
        
        if (k < 2) {
            throw new IllegalArgumentException("k: Menor que 2");
        }
        
        int i = 2;
        long e = n + 1;
        
        while (i <= k) {
            int p = Produto.produto(n,i);
            long f = Fat17.fat(i);
            e += p/f;
            i++;
        }
        
        return e;
    }
    
}
