package br.ufg.inf.es.construcao.paridade;

/**
 * Verifica se um número é ímpar ou par.
 */
public class Paridade {

    /**
     * @param n Número a ser consultado
     * @return Tem valor verdadeiro caso o número seja par e falso para ímpar.
     */      
    public static boolean paridade (int n) {
        return ((n % 2) == 0);
    }
    
}
