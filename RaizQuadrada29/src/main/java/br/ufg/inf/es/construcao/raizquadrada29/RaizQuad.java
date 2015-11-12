package br.ufg.inf.es.construcao.raizquadrada29;

/**
 * Calcula a raiz ( que pode ser quadrada ou não) de um número.
 */
public class RaizQuad {

    /**
     * @param n Número a ser calculada a raiz
     * @trhow n Não deve ser menor que 0.
     * @param i tipo de raiz a ser calculada.
     * @return Resultado da hipotenusa.
     */        
    public static float raizquad(int n, int i) {
        if (n < 0) {
            throw new IllegalArgumentException("n: Menor que 0");
        }
        
        float r = 1;
        
        while (i >= n) {
            r = (r + n/r)/2;
            i -= 1;
        }
        
        return r;
    }
    
}

