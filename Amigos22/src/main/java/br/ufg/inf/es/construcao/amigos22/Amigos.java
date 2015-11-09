package br.ufg.inf.es.construcao.amigos22;

public class Amigos {
    
    public static int amigos(int n, int m) {
        if (m < 0) {
            throw new IllegalArgumentException("m: Menor que 0");
        }
        if (n < 0) {
            throw new IllegalArgumentException("n: Menor que 0");
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