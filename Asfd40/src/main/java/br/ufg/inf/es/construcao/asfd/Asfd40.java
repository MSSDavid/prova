package br.ufg.inf.es.construcao.asfd;

import br.ufg.inf.es.construcao.fatorial17.Fat17;
/**
 * Media do n primeiros elementos de um vetor.
 */
public class Asfd40 {

    /**
     * @param A[] Vetor a ser preenchido com números inteiros.
     * @param n posição à qual se deseja somar os elementos do vetor.
     * @trhow n Não pode ser menor que zero
     * @return Resultado da media da soma dos elementos do vetor.
     */      
    public static boolean fatdig(int n) {
        int a = ( n / 100);
        int b = (n - (100 * a)) / 10;
        int c = n % 10;
        int s = Fat17.fat(a) + Fat17.fat(b) + Fat17.fat(c);
        
        return (s == n);
    }
    

    
}