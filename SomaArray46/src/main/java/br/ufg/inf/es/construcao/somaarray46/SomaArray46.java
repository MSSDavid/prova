package br.ufg.inf.es.construcao.somaarray46;

/**
 * Soma do n primeiros elementos de um vetor.
 */
public class SomaArray46 {

    /**
     * @param A[] Vetor a ser preenchido com números inteiros.
     * @param n posição à qual se deseja somar os elementos do vetor.
     * @trhow n Não pode ser menor que zero
     * @return Resultado da soma.
     */      
    public static int somaarray46(int A[], int n) {
        
        if (n < 0) { 
            throw new IllegalArgumentException("n: Menor que 0");
        }
               
        
        int s = 0;
        int i = 0;
        
        while (i < n) {
            s = (s + A[i]);
            i += 1;
        }
        
        return s;
    }
    

    
}
