package br.ufg.inf.es.construcao.pi15;

/*import br.com.es.construcao.produto4;*/
/**
 * x: Base
 * y: Potencia
 * p: Variável Auxiliar
 * d: Resultado
 */
public class Pi15 {
    
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