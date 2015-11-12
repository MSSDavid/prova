package br.ufg.inf.es.construcao.pi15;

/**
 * Calcula o pi.
 */
public class Pi15 {

    /**
     * @param n Quanto maior, mais preciso será de pi.
     * @trhow n Não deve ser menor que 1.
     * @return Resultado do fatorial de n.
     */     
    public static double pi(int n) {
        
        if (n < 1) {
            throw new IllegalArgumentException("n: Menor que 1");            
        }
        
        double i = 1;
        double s = -1;
        double d = -1;
        double p = 0;
        
        while (i <= n) {
            d += 2;
            s = -1 * s;
            p += (4*s)/d;
            i++;
        }
        
        return p;
    }
    
}