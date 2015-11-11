package br.ufg.inf.es.construcao.harmonico13;

public class Harmonico13 {
    
    public static double harmonico(int n) {
     if (n < 1) {
            throw new IllegalArgumentException("n: Menor que 1");
        }
     
     int i = 2;
     double s = 1;
     
     while (i <= n) {
         s += (1.0/i);
         i = 1+i;
     }
     return s;
    }
    
}
