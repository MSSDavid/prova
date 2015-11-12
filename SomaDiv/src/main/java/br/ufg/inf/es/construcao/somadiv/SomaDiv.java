package br.ufg.inf.es.construcao.somadiv;

/**
 * Calcula a soma dos divisores de um número.
 */
public class SomaDiv {

    /**
     * @param n Número a ter seus divisores somados
     * @trhow n Não deve ser menor que zero.
     * @return Soma dos divisores de n.
     */       
    public static int somaDiv(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n: Menor que 0");
        }
        
        int d = 2;
        int s = 1;
        
        while (d <= (Math.abs(n))/2) {
            if ((n % d)==0) {
                s += d;
            }
            
            d += 1;
        }
        
        return s;
    }
    
}
