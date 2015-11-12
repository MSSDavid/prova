package br.ufg.inf.es.construcao.amigos22;

import br.ufg.inf.es.construcao.somadiv.SomaDiv;

/**
 * Calcula se dois inteiros são 'amigos' ou seja, se cada um deles 
 * é a soma dos divisores do outro.
 */
public class Amigos22 {

    /**
     * @param n Primeiro dos números a ser verificado
     * @trhow n Não deve ser menor que zero.
     * @param m Segundo dos números a ser verificado.
     * @trhow m Não deve ser menor que zero. 
     * @return Verdadeiro se a soma dos divisores de n e m são iguais.
     */     
    public static boolean amigos(int n, int m) {
        if (m < 0) {
            throw new IllegalArgumentException("m: Menor que 0");
        }
        if (n < 0) {
            throw new IllegalArgumentException("n: Menor que 0");
        }
        
        int sn = SomaDiv.somaDiv(n);
        int sm = SomaDiv.somaDiv(m);
        
        return (sn == sm);
    }
    
}
