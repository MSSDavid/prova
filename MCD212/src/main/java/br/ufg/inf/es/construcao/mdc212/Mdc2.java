package br.ufg.inf.es.construcao.mdc212;

/**
 * Calcula o máximo divisor comum entre dois inteiros.
 */
public class Mdc2 {

    /**
     * @param a Primeiro dos números a ser calculado.
     * @trhow a Não deve ser menor que o segundo parâmetro.
     * @param b Segundo dos números a ser calculado.
     * @trhow b Não deve ser menor que o 0, nem maior que a. 
     * @return Retorna o MDC de a e b.
     */        
    public static int mdc2(int a, int b) {
        
        if (a < b) {
            throw new IllegalArgumentException("A menor que B");
        }
        
        if (b < 0) {
            throw new IllegalArgumentException("B menor que 0");
        }
        
        while (a != b) {
            if (a > b) {
                a -= b;
            }else {
                b -= a;
            }
        }
        
        return a;
    }
    
}
