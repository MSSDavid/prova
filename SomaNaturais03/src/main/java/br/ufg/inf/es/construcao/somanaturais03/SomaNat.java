package br.ufg.inf.es.construcao.somanaturais03;

/**
 * Soma dos termos de uma progressão aritmética. 
 */
public class SomaNat {

    /**
     * @param n Último termo da progressão.
     * @return Retorna a soma dos termos de uma progressão aritmética.
     */        
    public static int somanat (int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n: Menor que 1");
        }
        
        int i = 2;
        int s = 1;
        
        while (i <= n) {
            s += i;
            i += 1;
        }
        
        return s;
    }
    
}