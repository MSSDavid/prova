package br.ufg.inf.es.construcao.fatorial16;

public class Fatorial {
    
    public static int fatorial(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n: Menor que 1");
        }
        int i = 2;
        int f = 1;
        
        while (i <= n) {
            f = (f * i);
            i += 1;
        }
        
        return f;
    }
    
}

