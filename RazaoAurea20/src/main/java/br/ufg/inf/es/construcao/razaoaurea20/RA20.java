package br.ufg.inf.es.construcao.razaoaurea20;

/**
 * Verifica a razão área.
 */
public class RA20 {
    
    public static double ra20(double t, double tt, double f) {
        if (t <= 0) {
            throw new IllegalArgumentException("t: Menor que 0 ou igual a 0");
        }
        
        if (t > tt) {
            throw new IllegalArgumentException("tt: Menor que t");
        }
        
        double tc = tt;
        double ta = t;
        double i = 1;
                
        while (i <= f) {
            tc += ta;
            ta = tc - ta;
            i++;
        }
        
        return tc/ta;
    }
    
}
