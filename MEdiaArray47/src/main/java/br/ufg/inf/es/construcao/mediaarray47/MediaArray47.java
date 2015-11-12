package br.ufg.inf.es.construcao.mediaarray47;

import br.ufg.inf.es.construcao.somaarray46.SomaArray46;
/**
 * Media do n primeiros elementos de um vetor.
 */
public class MediaArray47 {

    /**
     * @param A[] Vetor a ser preenchido com números inteiros.
     * @param n posição à qual se deseja somar os elementos do vetor.
     * @trhow n Não pode ser menor que zero
     * @return Resultado da media da soma dos elementos do vetor.
     */      
    public static int mediarray(int A[], int n) {
        
        if (n < 0) { 
            throw new IllegalArgumentException("n: Menor que 0");
        }
               
        
        int s = SomaArray46.somaarray46(A[], n);
        
        return s/n;
    }
    

    
}

