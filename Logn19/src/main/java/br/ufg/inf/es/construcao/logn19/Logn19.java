package br.ufg.inf.es.construcao.logn19;

public class Logn19 {
    
    public static long logn19(int n, int k) {
        if (n < 1) {
            throw new IllegalArgumentException("n: Menor que 1");
        }
        
        if (k < 2) {
            throw new IllegalArgumentException("k: Menor que 2");
        }
        
        int i = 2;
        long e = n + 1;
        long t = n;
        
        while (i <= k) {
            t = (t * n)/i;
            e += t;
            i += 1;
        }
        
        return e;
    }
    
}
