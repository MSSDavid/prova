package br.ufg.inf.es.construcao.somatorio14;

/**
 * Somatório de várias frações 1/1+...+1/n-1+1/n
 */
public class Somat14 {

    /**
     * @param n Número de vezes que será feita a fração.
     * @trhow n Não deve ser menor que 1.
     * @return Resultado do somatíro das frações.
     */      
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

