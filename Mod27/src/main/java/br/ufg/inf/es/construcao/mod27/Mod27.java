package br.ufg.inf.es.construcao.mod27;

public class Mod27 {
    
    public static int mod27(int x, int y) {
        if (x <= 0) {
            throw new IllegalArgumentException("x: Menor que 0");
        }
        if (y < 0) {
            throw new IllegalArgumentException("y: Menor que 0");
        }
        
        int s = x;
        
        while (s >= y) {
            s -= y;
        }
        
        return s;
    }
    
}