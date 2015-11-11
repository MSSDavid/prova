package br.ufg.inf.es.construcao.somatorio14;

/*import br.com.es.construcao.produto4;*/
/**
 * x: Base
 * y: Potencia
 * p: Variável Auxiliar
 * d: Resultado
 */
public class Somat14 {
    
    public static double somat(int n) {
        
        if (n < 1) {
            throw new IllegalArgumentException("n: Menor que 1");            
        }
        
        double i = 1;
        double s = 0;
        
        while (i<=n) {
            double d = 1 + (i*i);
            s += 1/d;
            i++;
        }
        
        return s;
    }
    
}

