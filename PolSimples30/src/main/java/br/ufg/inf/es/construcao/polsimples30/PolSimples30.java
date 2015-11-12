package br.ufg.inf.es.construcao.polsimples30;

public class PolSimples30 {
    
    public static long polsimples(int n, int k) {
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
